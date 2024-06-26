package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DivApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        System.out.println("Please insert numerator, denominator");
        numerator = scanner.nextInt();
        denominator = scanner.nextInt();

        if(denominator == 0){
            System.out.println("Denominator can not be zero");
            System.exit(1);
        }

        result = numerator / denominator;
        System.out.println("Result " + result);
    }
}
