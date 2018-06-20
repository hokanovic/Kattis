package hknvc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Modulo {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            numbers.add(sc.nextInt() % 42);
        }
        System.out.println(numbers.size());
    }
}
