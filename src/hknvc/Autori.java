package hknvc;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine() + "-";
        int max = input.replaceAll("[^\\-]", "").length();
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            sb.append(input.charAt(index));
            index = input.indexOf("-", index) + 1;
        }
        System.out.println(sb.toString());
        scanner.close();
    }
}
