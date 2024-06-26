package gr.aueb.cf.ch4;

/**
 * Calculates the sum and multiplication of the the first 10 numbers from 1 to 10
 */


public class SumMulFor {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for ( int i = 1; i <= 10; i++) {
            sum += i;
            mul *= i;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);
    }
}
