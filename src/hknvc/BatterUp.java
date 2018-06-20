package hknvc;

import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = n;
        double bats = 0;
        for (int i = 0; i < s; i++) {
            int bat = sc.nextInt();
            if (bat < 0) {
                n--;
            } else {
                bats += bat;
            }
        }
        System.out.println(bats / n);
    }
}
