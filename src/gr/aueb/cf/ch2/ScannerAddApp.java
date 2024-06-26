package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Reads 2 integers from stdin, adds them,
 * and prints the result
 */
public class ScannerAddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        //Commands
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        // Print results

        System.out.printf("%d + %d = %d", num1, num2, sum);

    }
}
