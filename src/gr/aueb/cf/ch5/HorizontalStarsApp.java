package gr.aueb.cf.ch5;

/*
* The following prints out n horizontal stars,
* where n is input by the user */

import java.util.Scanner;

public class HorizontalStarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 0;

//        Commands

        System.out.println("Please insert the number of stars");
        n = in.nextInt();

        for (int i =1; i <= n; i++) {
            System.out.print("*");
        }

        System.out.println();

    }
}
