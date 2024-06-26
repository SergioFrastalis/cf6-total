package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BingoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 12;
        int num = 0;
        boolean isBingo = false;

        do{

            System.out.println("Please insert a num");
            num = scanner.nextInt();

            if (num == SECRET) {
                System.out.println("Bingo!!!");
                isBingo = true;
            } else{
                System.out.println("Try again");
            }
        } while (!isBingo);

    }



}
