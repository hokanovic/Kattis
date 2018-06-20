package hknvc;

import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        StringBuilder sb = new StringBuilder();
        int last = input.length() - 1;
        for (int i = 0; i < last; i++) {
            char now = input.charAt(i);
            char next = input.charAt(i+1);
            if (now != next) {
                sb.append(now);
            }
        }
        sb.append(input.charAt(last));
        System.out.println(sb.toString());
    }
}
