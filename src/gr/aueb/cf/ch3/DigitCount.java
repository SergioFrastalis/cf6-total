package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int CopyOfNum = 0;
        int count = 0;
        int sum = 0;
        int rhDigit = 0;
        int sumOfDigits = 0;

        System.out.println("PLease insert an int");
        num = in.nextInt();

        CopyOfNum = num;

        do{
            count++;

            rhDigit = CopyOfNum % 10;
            sumOfDigits += rhDigit;

            CopyOfNum = CopyOfNum/10;
        }while (CopyOfNum != 0);

        System.out.println("Digit-count: " + count);
        System.out.println("Sum of digits: " + sumOfDigits);
    }




}
