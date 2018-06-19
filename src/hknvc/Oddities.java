package hknvc;

import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        for (int i = 0; i < repeat; i++) {
            int inp = sc.nextInt();
            System.out.println(inp + " is " + (inp % 2 == 0 ? "even" : "odd"));
        }
    }
}
