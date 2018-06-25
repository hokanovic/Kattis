package hknvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String inputStr = sc.nextLine();
            if (inputStr.charAt(0) == '0') {
                break;
            }
            String partOfPhrase = inputStr.substring(0, inputStr.indexOf(" "));
            String phrase = inputStr.substring(inputStr.indexOf(" ") + 1);

            int type1 = calcType1(partOfPhrase, phrase);
            int type2 = calcType2(partOfPhrase, phrase);
            int type3 = calcType3(partOfPhrase, phrase);

            StringBuilder sb = new StringBuilder();
            sb.append(type1).append(" ");
            sb.append(type2).append(" ");
            sb.append(type3);

            System.out.println(sb.toString());

        }
    }

    private static int calcType1(String partOfPhrase, String phrase) {
        int repeat = phrase.length() - partOfPhrase.length();
        int occurencies = 0;
        for (int i = 0; i <= repeat; i++) {
            for (int j = 0; j < partOfPhrase.length(); j++) {
                if (!(phrase.charAt(i + j) == partOfPhrase.charAt(j))) {
                    break;
                }
                if (j == partOfPhrase.length() - 1) {
                    occurencies++;
                }
            }
        }
        return occurencies;
    }

    private static int calcType2(String partOfPhrase, String phrase) {
        List<String> strList = new ArrayList<>();
        int occurencies = 0;
        int start = partOfPhrase.length();
        for (int i = start; i > 0; i--) {
            String first = partOfPhrase.substring(0, i - 1);
            String second = partOfPhrase.substring(i);
            String newPartOfPhrase = first + second;
            if (!strList.contains(newPartOfPhrase)) {
                occurencies += calcType1(newPartOfPhrase, phrase);
            }
            strList.add(newPartOfPhrase);
        }
        return occurencies;
    }

    private static int calcType3(String partOfPhrase, String phrase) {
        List<String> strList = new ArrayList<>();
        int occurencies = 0;
        int start = partOfPhrase.length();
        for (int i = start; i >= 0; i--) {
            for (char chr : "ATCG".toCharArray()) {
                String first = partOfPhrase.substring(0, i);
                String second = partOfPhrase.substring(i);
                String newPartOfPhrase = first + chr + second;
                if (!strList.contains(newPartOfPhrase)) {
                    occurencies += calcType1(newPartOfPhrase, phrase);
                }
                strList.add(newPartOfPhrase);
            }
        }
        return occurencies;
    }
}
