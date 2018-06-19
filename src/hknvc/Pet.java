package hknvc;

import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxPoints = 0;
        int topStudent = 0;

        for (int i = 1; i <= 5; i++) {
            int inputPoints = 0;
            inputPoints += scanner.nextInt();
            inputPoints += scanner.nextInt();
            inputPoints += scanner.nextInt();
            inputPoints += scanner.nextInt();

            if (inputPoints > maxPoints) {
                maxPoints = inputPoints;
                topStudent = i;
            }
        }
        System.out.println(topStudent + " " + maxPoints);
    }
}
