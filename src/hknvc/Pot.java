package hknvc;

import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < repeat; i++) {
            String input = scanner.next();
            int tal = Integer.parseInt(input.substring(0,input.length()-1));
            int pow = Integer.parseInt(""+input.charAt(input.length()-1));
            sum += Math.pow(tal,pow);
        }
        System.out.println(sum);
    }
}
