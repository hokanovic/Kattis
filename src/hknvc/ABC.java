package hknvc;

import java.util.Arrays;
import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tal = new int[3];
        tal[0] = sc.nextInt();
        tal[1] = sc.nextInt();
        tal[2] = sc.nextInt();

        Arrays.sort(tal);

        String input = sc.next();
        String output = "";
        for (int i = 0; i < 3; i++) {
            String chr = input.substring(i,i+1).replaceAll("A","0").replaceAll("B","1").replaceAll("C","2");
            int chri = Integer.parseInt(chr);
            output += tal[chri] + " ";
        }
        System.out.println(output);
    }
}
