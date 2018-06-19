package hknvc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PhoneList {
    public static void main(String[] args) {

        List<String> phoneList = new ArrayList<>();
        List<String> YESNO = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {
            phoneList.clear();

            int total = scanner.nextInt();
            for (int j = 0; j < total; j++) {
                String number = scanner.next();
                phoneList.add(number);
            }

            Collections.sort(phoneList);
            boolean isConsistent = true;

            for (int j = 0; (j < (phoneList.size() - 1)); j++) {
                String potentialPrefix = phoneList.get(j);
                String couldHavePrefix = phoneList.get(j + 1);

                if (couldHavePrefix.length() >= potentialPrefix.length()) {
                    String phoneNumb = couldHavePrefix.substring(0, potentialPrefix.length());

                    if (phoneNumb.equals(potentialPrefix)) {
                        isConsistent = false;
                    }
                }
            }
            YESNO.add(isConsistent ? "YES" : "NO");
        }
        for (String s : YESNO) {
            System.out.println(s);
        }
    }
}

