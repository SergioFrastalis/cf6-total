package gr.aueb.cf.ch2;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EurotoUSConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int euros = 0;
        int dollars = 0;
        int cents = 0;
        int remainingCents =0;
        final int US_PARITY = 99;

        System.out.println("Please insert the amount in euros");
        euros = in.nextInt();

        cents = euros * US_PARITY;
        dollars = cents/ 100;
        remainingCents = cents % 100;

        System.out.printf("%,d euros = %,d total cents = %,d dollars and %,d cents", euros, cents, dollars,
                remainingCents);

    }
}
