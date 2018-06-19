package hknvc;

import java.util.Scanner;

public class Spavanac {
    private static int hh;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hh = scanner.nextInt();
        int mm = scanner.nextInt();
        if (mm >= 45) {
            mm = mm - 45;
        } else {
            minusHour();
            mm = 15 + mm;
        }
        System.out.println(hh + " " + mm);
    }

    private static void minusHour() {
        if (hh == 0) {
            hh = 23;
        } else {
            hh--;
        }
    }
}
