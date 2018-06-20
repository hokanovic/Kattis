package hknvc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Apaxiaaaaaaaaaaaans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        StringBuilder sb = new StringBuilder();
        char prev = input.charAt(0);
        sb.append(prev);
        for (int i = 1; i < input.length(); i++) {
            char next = input.charAt(i);
            if (prev != next) {
                sb.append(next);
                prev = next;
            }
        }
        System.out.println(sb.toString());
    }
}
