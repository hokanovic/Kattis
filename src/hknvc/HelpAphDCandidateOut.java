package hknvc;

import java.util.Scanner;

public class HelpAphDCandidateOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int index = 0;
        while (index++ != max) {
            String input = scanner.next();
            if (input.equals("P=NP")) {
                System.out.println("skipped");
                continue;
            }
            if (input.equals("0+0")) {
                System.out.println("0");
                continue;
            }
            String[] arr = input.split("\\+");
            System.out.println((Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])));
        }
    }
}


