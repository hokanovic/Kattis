package hknvc;

import java.util.Scanner;

public class ReversedBinaryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String binary = Integer.toBinaryString(input);
        binary = new StringBuilder(binary).reverse().toString();
        int charCode = Integer.parseInt(binary, 2);
        System.out.println(charCode);
    }
}
