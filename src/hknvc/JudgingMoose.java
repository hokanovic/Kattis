package hknvc;

import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        boolean isMoose = !(left == 0 && right == 0);
        boolean isEven = left == right;
        int amt = (Math.max(left,right)*2);
        System.out.println((!isMoose ? "Not a moose" : isEven ? "Even " + amt : "Odd " + amt));
    }
}
