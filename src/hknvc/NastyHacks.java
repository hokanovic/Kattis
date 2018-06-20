package hknvc;

import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        for (int i = 0; i < repeat; i++) {
            int r = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            int s = r - (e - c);
            System.out.println(s == 0 ? "does not matter" : s < 0 ? "advertise" : "do not advertise");
        }
    }
}
