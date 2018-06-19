package hknvc;

import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String temps = scanner.nextLine();
        int Amt = temps.replaceAll("[^-]","").length();
        System.out.println(Amt);
    }
}

