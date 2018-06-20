package hknvc;


import java.util.Scanner;

public class OneChickenPerPerson {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ppl = sc.nextInt();
        int chickens = sc.nextInt();

        int sum = chickens - ppl;

        if (chickens > ppl) {
            System.out.println("Dr. Chaz will have " + sum + (sum > 1 ? " pieces" : " piece") + " of chicken left over!");
        }
        else {
            System.out.println("Dr. Chaz needs " + Math.abs(sum) + " more" + (Math.abs(sum) > 1 ? " pieces" : " piece") + " of chicken!");
        }
    }

}
