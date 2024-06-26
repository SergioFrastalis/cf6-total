package gr.aueb.cf.ch1;

//The following prompts the user for 3 integers,
//and returns the date in a DD/MM/YY format.

import java.util.Scanner;

public class DateApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int day = 0;
        int month = 0;
        int year = 0 ;

//      Commands

        System.out.println("Please insert day, month and year: ");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

//        Print Results

        System.out.printf("The date is: %02d/%02d/%02d", day, month, year % 100 );

    }
}
