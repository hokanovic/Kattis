package hknvc;

import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        double hyp = Math.hypot(sc.nextInt(), sc.nextInt());
        for (int i = 0; i < repeat; i++) {
            System.out.println(sc.nextInt() <= hyp ? "DA" : "NE");
        }
    }
}
