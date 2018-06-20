package hknvc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IHaveBeenEverywhereMan {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {
            int total = scanner.nextInt();
            cities.clear();
            for (int j = 0; j < total; j++) {
                String city = scanner.next();
                cities.add(city);
            }
            System.out.println(cities.size());
        }
    }
}
