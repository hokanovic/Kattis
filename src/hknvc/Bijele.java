package hknvc;

import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int patient = scanner.nextLine().length();
        int doctor = scanner.nextLine().length();
        System.out.println(patient >= doctor ? "go" : "no");
    }
}