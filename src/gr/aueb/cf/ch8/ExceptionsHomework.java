package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ExceptionsHomework {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {

        int choice = 0;


        do {
            printMenu();
            choice = getChoice();

            try {
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }while (choice != 5);

    }

    public static void printMenu() {
        System.out.println("Choose on of the following: ");
        System.out.println("1. Choice 1 ");
        System.out.println("2. Choice 2 ");
        System.out.println("3. Choice 3 ");
        System.out.println("4. Choice 4 ");
        System.out.println("5. Exit ");

    }

    public static int getChoice() {
        int n = 0;

        if (in.hasNextInt()) {
            n = in.nextInt();
        } else {
            System.out.println("Invalid choice");
            in.next();
        }
         return n;
    }

    public static void printChoice(int choice) {
        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException("Invalid choice. Please enter a number between 1 and 5.");
        }

        switch (choice) {
            case 1:
                System.out.println("You chose Option 1");
                break;
            case 2:
                System.out.println("You chose Option 2");
                break;
            case 3:
                System.out.println("You chose Option 3");
                break;
            case 4:
                System.out.println("You chose Option 4");
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                throw new IllegalArgumentException("Invalid choice. Please enter a number between 1 and 5.");
        }
    }
}
