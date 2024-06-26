package gr.aueb.cf.ch4;


/**
 * Prints 10 lines, 1st one 10 stars, 2nd 9, etc
 */

public class Stars10Desc {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j =i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
