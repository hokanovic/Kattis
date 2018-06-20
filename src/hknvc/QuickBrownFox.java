package hknvc;

import java.util.Scanner;

public class QuickBrownFox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        sc.nextLine();
        for (int x = 0; x < repeat; x++) {
            String phrase = sc.nextLine().toLowerCase();
            StringBuilder missingLetters = new StringBuilder();
            boolean isPangram = true;
            for (int i = 97; i < 123; i++) {
                char chr = (char) i;
                boolean contains = phrase.indexOf(chr) >= 0;
                if (!contains) {
                    missingLetters.append(chr);
                    isPangram = false;
                }
            }
            System.out.println();
            if (isPangram) {
                System.out.println("Pangram");
            } else {
                System.out.println("missing " + missingLetters.toString());
            }
        }
    }
}
