package hknvc;

import java.util.Scanner;

public class Trik {

    static String res = "100";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A') {
                ch(1, 0, 2);
            } else if (input.charAt(i) == 'B') {
                ch(0, 2, 1);
            } else if (input.charAt(i) == 'C') {
                ch(2, 1, 0);
            }
        }

        System.out.println(res.replaceAll("100","1").replaceAll("010","2").replaceAll("001","3"));
    }

    private static void ch(int n1, int n2, int n3) {
        res = "" + res.charAt(n1) + res.charAt(n2) + res.charAt(n3);
    }
}
