package gr.aueb.cf.ch7;

import java.util.Scanner;

public class EncryptASCII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        String output;

        System.out.println("Please insert a word");
        input = in.next();
        output = replaceWithNextASCIIChar(input);
        System.out.println(output);
    }

    public static String replaceWithNextASCIIChar(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            result.append((char) (c+1));
        }
        return result.toString();
    }
}
