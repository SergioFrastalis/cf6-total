package gr.aueb.cf.ch1;

//The following receives an input from the user,
//which corresponds to a year. It then determines
//if this year is a leap year or not.



import java.util.Scanner;

public class LeapYearApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean isLeapYear = false;

        //      Commands

        System.out.println("Please insert year: ");
        year = in.nextInt();

        isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

        System.out.println("Leap Year: " + isLeapYear);
    }
}
