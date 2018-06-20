package hknvc;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> words = new HashSet<>();

        int tot = 0;
        while (sc.hasNext()) {
            words.add(sc.next());
            tot++;
        }

        System.out.println(tot == words.size() ? "yes" : "no");
    }
}
