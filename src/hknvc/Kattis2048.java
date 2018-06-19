package hknvc;

import java.util.Random;
import java.util.Scanner;

public class Kattis2048 {

    static int[][] board = new int[4][4];
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initBoard();

        addBlock();
        addBlock();

        printBoard();

        while (true) {
            String input = scanner.next();
            rotateBoardFrom(input);
            gravitate();
            gravitate();
            gravitate();
            checkForMerges();
            while (gravitate()) {
            }
            rotateBoardFrom(resetRotate(input));
            addBlock();
            printBoard();
        }
    }

    private static String resetRotate(String input) {
        switch (input) {
            case "up":
                return "down";
            case "down":
                return "up";
            case "right":
                return "right";
        }
        return "left";
    }

    private static void rotateBoardFrom(String direction) {
        int[][] tempBoard = cloneBoard(board);
        switch (direction) {
            case "right":
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[i].length; j++) {
                        board[i][j] = tempBoard[i][3 - j];
                    }
                }
                break;
            case "up":
                for (int i = 0; i < board[0].length; ++i) {
                    for (int j = 0; j < board.length; ++j) {
                        board[i][j] = tempBoard[j][tempBoard[0].length - i - 1];
                    }
                }
                break;
            case "down":
                for (int i = 0; i < board[0].length; ++i) {
                    for (int j = 0; j < board.length; ++j) {
                        board[i][j] = tempBoard[board.length - j - 1][i];
                    }
                }
                break;
        }
    }

    private static boolean gravitate() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                Position oldSpot = new Position(j, i);
                Position newSpot = new Position(j - 1, i);
                if (slotIsOccupied(oldSpot) && (!slotIsOccupied(newSpot))) {
                    relocateBlock(oldSpot, newSpot);
                    return true;
                }
            }
        }
        return false;
    }

    private static void checkForMerges() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == board[i][j + 1]) {
                    Position doubleUp = new Position(j, i);
                    Position vanish = new Position(j + 1, i);
                    mergeBlocks(doubleUp, vanish);
                }
            }
        }
    }

    private static void relocateBlock(Position oldSpot, Position newSpot) {
        board[newSpot.getY()][newSpot.getX()] = board[oldSpot.getY()][oldSpot.getX()];
        board[oldSpot.getY()][oldSpot.getX()] = 0;
    }

    private static void mergeBlocks(Position doubleUp, Position vanish) {
        board[doubleUp.getY()][doubleUp.getX()] *= 2;
        board[vanish.getY()][vanish.getX()] = 0;
    }

    private static boolean addBlock() {
        if (emptySlotsExists()) {
            int x, y;
            do {
                x = random.nextInt(4);
                y = random.nextInt(4);
            }
            while (slotIsOccupied(new Position(x, y)));
            board[y][x] = random.nextInt(2) == 0 ? 2 : 4;
            return true;
        } else {
            return false;
        }
    }

    private static boolean slotIsOccupied(Position position) {
        return board[position.getY()][position.getX()] != 0;
    }

    private static boolean emptySlotsExists() {
        for (int[] ints : board) {
            for (int anInt : ints) {
                if (anInt == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void initBoard() {
        for (int[] ints : board) {
            for (int anInt : ints) {
                anInt = 0;
            }
        }
    }

    private static void printBoard() {
        System.out.println();
        for (int[] ints : board) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] cloneBoard(int[][] originalArray) {
        int[][] A2 = originalArray.clone();
        for (int i = 0; i < A2.length; i++) {
            A2[i] = A2[i].clone();
        }
        return A2;
    }
}

class Position {
    int x;
    int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

