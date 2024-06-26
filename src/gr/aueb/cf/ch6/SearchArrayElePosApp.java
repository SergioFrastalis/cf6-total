package gr.aueb.cf.ch6;

import java.util.Scanner;

public class SearchArrayElePosApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = {2, 456, 45, 4, 6, 324, 4353, 7, 21, 34, 546, 11, 3, 12};
        int position = -1;
        int element = 0;


        System.out.println("Please insert the element of the array that you would like to know the position of: ");
        element = in.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element){
                position = i;
                break;
            }
        }

        if (position != -1){
            System.out.println("The element is at the position: " + position);
        } else {
            System.out.println("The element you are looking for is not in this array.");
        }

    }
}
