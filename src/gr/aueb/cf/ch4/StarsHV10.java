package gr.aueb.cf.ch4;

/**
 * Prints 10 liunes with
 * 10 stars per line
 */

public class StarsHV10 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
