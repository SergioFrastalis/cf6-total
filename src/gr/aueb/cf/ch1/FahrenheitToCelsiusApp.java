package gr.aueb.cf.ch1;

import java.util.Scanner;

//The following receives an input from the user ( by necessity an integer)
//that corresponds to a temperature in Fahrenheit, proceeds to changing it
// to Celsius and printing it out in the Run Window.

public class FahrenheitToCelsiusApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp1 = 0;
        int temp2 = 0;

//        Commands

        System.out.println("Please insert temperature in Fahrenheit: ");
        temp1 = in.nextInt();
        temp2 = (5*(temp1-32))/9;

//        Print results

        System.out.printf("The temperature is %2d degrees, Celsius ", temp2);
    }
}
