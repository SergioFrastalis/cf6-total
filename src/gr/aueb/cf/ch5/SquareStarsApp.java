package gr.aueb.cf.ch5;

import java.util.Scanner;

/*
 * The following prints out n x n stars,
 * where n is input by the user */

public class SquareStarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 0;

//        Commands

        System.out.println("Please insert the number of stars");
        n = in.nextInt();

        for(int i = 1; i <= n; i++){
            for (int j =1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
