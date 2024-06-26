package gr.aueb.cf.ch5;

/*
 * The following prints out n-1 stars,
 * per line, making an upper triangle shape,
 * where n is input by the user */

import java.util.Scanner;

public class UpperTriangleStarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = 0;

//        Commands

        System.out.println("Please insert the number of stars");
        n = in.nextInt();

        for(int i = 1; i <= n; i++){
            for (int j = n - i + 1; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
