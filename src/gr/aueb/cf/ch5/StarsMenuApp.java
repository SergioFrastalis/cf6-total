package gr.aueb.cf.ch5;

import java.util.Scanner;

public class StarsMenuApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int num1 = 0;
        int  result = 0;

        do {
            printMenu();
            choice = getUserChoice();

            if (choice < 1 || choice > 6) {
                System.out.println("Μη έγκυρη επιλογή");
                continue;
            }

            if ( choice == 6) {
                System.out.println("Thank you for using our app");
                break;
            }

            System.out.println("Παρακαλώ, εισάγετε έναν αριθμό n");
            num1 = in.nextInt();
            result = getResult(choice, num1);

        }while (choice != 6);


    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια ");
        System.out.println("2. Εμφάνισε n αστεράκια κατακόρυφα ");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια ");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1-n ");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n-1 ");
        System.out.println("6. Έξοδος από το πρόγραμμα ");
    }

    public static int getUserChoice() {
        return in.nextInt();
    }

    public static int getResult(int choice, int num1) {
        int result = 0;

        switch (choice) {
            case 1:
                horizontal(num1);
                break;

            case 2:
                vertical(num1);
                break;

            case 3:
                square(num1);
                break;

            case 4:
                lowerTriangle(num1);
                break;

            case 5:
                upperTriangle(num1);
                break;
        }
        return result;
    }

    public static void horizontal(int numStars) {
        for (int i =1; i <= numStars; i++) {
            System.out.print("*");
        }

        System.out.println();
    }

    public static void vertical(int numStars) {
        for (int i =1; i <= numStars; i++) {
            System.out.println("*");
        }

        System.out.println();
    }

    public static void square(int numStars) {
        for(int i = 1; i <= numStars; i++){
            for (int j =1; j <= numStars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void lowerTriangle(int numStars) {
        for(int i = 1; i <= numStars; i++){
            for (int j =1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void upperTriangle(int numStars) {
        for(int i = 1; i <= numStars; i++){
            for (int j = numStars - i + 1; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
