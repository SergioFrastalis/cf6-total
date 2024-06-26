package gr.aueb.cf.ch2;

/**
 * Template for programming
 * Multiplies 2 integers and prints
 * the result at the console
 */

public class Output2App {

    public static void main(String[] args) {

        int price = 100;
        int quantity= 5;
        int TotalPrice = 0;

        TotalPrice = price * quantity;

        System.out.printf("Price: %3d, Quantity: %d, Total PRice: %,d\n", price, quantity, TotalPrice);

    }
}
