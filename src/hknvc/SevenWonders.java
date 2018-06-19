package hknvc;

import java.util.Scanner;

public class SevenWonders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int t = input.replaceAll("[^T]","").length();
        int c = input.replaceAll("[^C]","").length();
        int g = input.replaceAll("[^G]","").length();
        int points = (int) (Math.pow(t,2) + Math.pow(c,2) + Math.pow(g,2));

        while (t-- > 0 && c-- > 0 && g-- > 0) {
            points += 7;
        }

        System.out.println(points);
        scanner.close();
    }
}
