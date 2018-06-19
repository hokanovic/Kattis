package hknvc;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if ((i % x == 0) && (i % y == 0)) {
                out("FizzBuzz");
            } else if (i % x == 0) {
                out("Fizz");
            } else if (i % y == 0) {
                out("Buzz");
            } else {
                out(String.valueOf(i));
            }
        }
    }

    private static void out(String msg) {
        System.out.println(msg);
    }
    
}
