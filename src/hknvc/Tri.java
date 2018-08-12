package hknvc;

import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a + b == c)
            System.out.println(a + "+" + b + "=" + c);
        else if (a - b == c)
            System.out.println(a + "-" + b + "=" + c);
        else if (a * b == c)
            System.out.println(a + "*" + b + "=" + c);
        else if (a == b + c)
            System.out.println(a + "=" + b + "+" + c);
        else if (a == b - c)
            System.out.println(a + "=" + b + "-" + c);
        else if (a == b * c)
            System.out.println(a + "=" + b + "*" + c);
        else if (a / b == c)
            System.out.println(a + "-" + b + "=" + c);
        else if (a == b / c)
            System.out.println(a + "=" + b + "/" + c);

    }
}
