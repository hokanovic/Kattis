package hknvc;

import java.util.HashMap;
import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int repeat = Integer.parseInt(sc.nextLine().trim());
            if (repeat == 0) {
                break;
            }

            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < repeat; i++) {
                String next = sc.nextLine();
                mapAdd(next, map);
            }

            int unique = map.size();
            int collision = calcCollisions(map);
            System.out.println(unique + " " + collision);
        }

    }

    private static void mapAdd(String next, HashMap<String, Integer> map) {
        if (map.containsKey(next)) {
            map.put(next, map.get(next) + 1);
        } else {
            map.put(next, 1);
        }
    }

    private static int calcCollisions(HashMap<String, Integer> strList) {
        int collisions = 0;
        for (String str1 : strList.keySet()) {
            char hash1 = hash(str1);
            for (String str2 : strList.keySet()) {
                if (!str1.equals(str2)) {
                    char hash2 = hash(str2);
                    if (hash1 == hash2)
                        collisions += strList.get(str1) * strList.get(str2);
                }
            }
        }
        return collisions / 2;
    }

    private static char hash(String str) {
        char xor = (char) 0;
        for (int i = 0; i < str.length(); i++)
            xor ^= str.charAt(i);
        return xor;
    }
}


