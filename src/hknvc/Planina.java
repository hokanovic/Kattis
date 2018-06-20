package hknvc;

import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        double sum = Math.pow(2,input) + 1;
        double sim = Math.pow(sum,2);
        System.out.println((int)sim);
    }
}
