package hknvc;

import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (input.contains("Simon says")) {
                System.out.println(input.substring(11));
            }
        }
    }
}
