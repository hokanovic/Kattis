package hknvc;

import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            System.out.println(i + " Abracadabra");
        }
    }
}
