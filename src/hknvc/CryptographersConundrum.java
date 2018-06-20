package hknvc;

import java.util.Scanner;

public class CryptographersConundrum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int days = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < 3; j++) {
                if ((""+input.charAt(i+j)).compareTo(""+"PER".charAt(j)) != 0) {
                    days++;
                }
            }
            i += 2;
        }
        System.out.println(days);
    }
}
