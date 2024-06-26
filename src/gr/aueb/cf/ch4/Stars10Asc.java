package gr.aueb.cf.ch4;

/**
 * Prints 10 lines of stars in ascending order,
 * first line is 1 star, 2nd 2 stars and so forth.
 */

public class Stars10Asc {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
