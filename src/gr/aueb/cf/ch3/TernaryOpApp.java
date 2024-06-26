package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TernaryOpApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int min = 0;

        System.out.println("Please insert two integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

//        if (num1 < num2) min = num1;

//        underneath  is a ternany operation. statement, iftrue : iffalse

        min = (num1 < num2) ? num1:num2;

        System.out.printf("The min of (%d, %d) is %d", num1, num2, min);
    }
}
