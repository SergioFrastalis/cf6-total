package gr.aueb.cf.ch4;

/** Demo of reading a char.
* 1.System.in.read()
*/

import java.io.IOException;
import java.util.Scanner;

public class CharReadApp {

    public static void main(String[] args) throws IOException {
        int inputChar = ' ';
        char inputChar2 = ' ';
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert an ASCII char");
        inputChar = System.in.read();

        System.out.println("Ordinal: " + inputChar);
        System.out.println("char: " + (char) inputChar);

        System.out.println("Please insert a Unicode char");
        inputChar = in.nextLine().charAt(0);
        System.out.println("Unicode Char: " + inputChar2);
    }
}
