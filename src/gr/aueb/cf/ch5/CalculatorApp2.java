package gr.aueb.cf.ch5;

import java.io.IOException;
import java.util.Scanner;

public class CalculatorApp2 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        char choice;
        int errorCode;
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        while (true) {
//            printMenu
            choice = getChoice();
            errorCode = validate(choice);

            if (errorCode == 1) {
                System.out.println("Quitting ...");
                break;
            }

            if (errorCode == 2) {
                System.out.println("Error in choice");
                continue;
            }

            System.out.println("Please insert two integers");
            num1 = in.nextInt();
            num2 = in.nextInt();
        }
    }

//    public static int getResultFromChoice(char choice, int num1, int num2) {
//        int result = 0;
//
//        switch (choice) {
//            case '1':
//                result = add(num1, num2);
//                break;
//            case '2':
//                result = sub(num1, num2);
//            case '3':
//                result = mul(num1, num2);
//            default:
//                result = Integer.MAX_VALUE;
//                break;
//        }
//        return result;
//    }

    public static char getChoice() throws IOException {
        return (char) System.in.read();
    }

    public static void printMenu(){
        System.out.println("Choose one of the following");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
    }

    public static int validate(char choice) {
        int errorCode;

        switch(choice) {
            case 'q':
            case 'Q':
                errorCode = 1;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
                errorCode = 0;
            default:
                errorCode = 2;
        }

        return errorCode;
    }

}
