package hknvc;

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        double v = Math.toRadians(sc.nextInt());
        int ladder = (int) Math.ceil(h / Math.sin(v));
        System.out.println(ladder);
    }
}
