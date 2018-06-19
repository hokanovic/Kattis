package hknvc;

import java.util.Scanner;

public class SolvingForCarrots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String inp = input.substring(input.indexOf(" ") + 1);
        System.out.println(inp);
    }
}
