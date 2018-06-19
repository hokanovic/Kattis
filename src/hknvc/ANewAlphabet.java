package hknvc;

import java.util.Scanner;

public class ANewAlphabet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        input = input.replaceAll("[Aa]","@");
        input = input.replaceAll("[Bb]","8");
        input = input.replaceAll("[Cc]","(");
        input = input.replaceAll("[Cc]","(");
        input = input.replaceAll("[Dd]","|)");
        input = input.replaceAll("[Ee]","3");
        input = input.replaceAll("[Ff]","#");
        input = input.replaceAll("[Gg]","6");
        input = input.replaceAll("[Hh]","[-]");
        input = input.replaceAll("[Ii]","|");
        input = input.replaceAll("[Jj]","_|");
        input = input.replaceAll("[Kk]","|<");
        input = input.replaceAll("[Ll]","1");
        input = input.replaceAll("[Mm]","[]\\\\/[]");
        input = input.replaceAll("[Nn]","[]\\\\[]");
        input = input.replaceAll("[Oo]","0");
        input = input.replaceAll("[Pp]","|D");
        input = input.replaceAll("[Qq]","(,)");
        input = input.replaceAll("[Zz]","2");
        input = input.replaceAll("[Rr]","|Z");
        input = input.replaceAll("[Ss]","\\$");
        input = input.replaceAll("[Tt]","']['");
        input = input.replaceAll("[Uu]","|_|");
        input = input.replaceAll("[Vv]","\\\\/");
        input = input.replaceAll("[Ww]","\\\\/\\\\/");
        input = input.replaceAll("[Xx]","}{");
        input = input.replaceAll("[Yy]","`/");
        System.out.println(input);
    }
}
