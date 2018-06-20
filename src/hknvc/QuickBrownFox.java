package hknvc;

import java.util.Scanner;

public class QuickBrownFox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine().toLowerCase();
        StringBuilder missingLetters = new StringBuilder();
        //97-122
        boolean isPangram = true;
        for (int i = 97; i < 123; i++) {
            String Chr = (char) i+"";
            boolean contains = phrase.contains(Chr);
            if (!contains) {
                missingLetters.append(Chr);
                isPangram = false;
            }
        }
        if (isPangram) {
            System.out.println("Pangram");
        }
        else {
            System.out.println("missing " + missingLetters.toString());
        }

    }
}
