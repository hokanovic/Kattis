package hknvc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ProblemB {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            int repeat = Integer.parseInt(sc.nextLine().trim());
            if (repeat == 0) {
                break;
            }

            Set<String> strSet = new HashSet<>();
            for (int i = 0; i < repeat; i++) {
                String next = sc.nextLine();
                strList.add(next);
                strSet.add(next);
            }
            int unique = strSet.size();
            int collision = calcCollisions(strList);

            System.out.println(unique + " " + collision);
        }
    }

    private static int calcCollisions(List<String> strList) {
        Set<String> set = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < strList.size() - 1; i++) {
            for (int j = i + 1; j < strList.size(); j++) {
                String next = hash(strList.get(i), strList.get(j));
                set.add(next);
                counter++;
            }
        }
        return (counter - set.size());
    }

    private static String hash(String strFirst, String strSecond) {
        StringBuilder sb = new StringBuilder();
        int repeat = Math.min(strFirst.length(), strSecond.length());
        for (int i = 0; i < repeat; i++) {
            sb.append((char) (strFirst.charAt(i) ^ strSecond.charAt(i)));
        }
        return sb.toString();
    }

}


