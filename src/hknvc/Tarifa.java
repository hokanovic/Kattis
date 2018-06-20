package hknvc;

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mb = sc.nextInt();
        int repeat = sc.nextInt();
        int sum = mb;
        for (int i = 0; i < repeat; i++) {
            sum += (mb - sc.nextInt());
        }
        System.out.println(sum);
    }
}
