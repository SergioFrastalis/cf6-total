package gr.aueb.cf.ch1;

//The following is a generic menu, that the user
//can halt, given a specific input.


import java.util.Scanner;

public class WhileMenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 5;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
            System.out.println();
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choice = in.nextInt();

            if ((choice <= 0) || (choice >5)){
                System.out.println("Μη αποδεκτή τιμή");
                System.out.println();
            }else if (choice == 1) {
                System.out.println("Επιλέχθηκε εισαγωγή");
                System.out.println();
            }else if (choice == 2) {
                System.out.println("Επιλέχθηκε διαγραφή");
                System.out.println();
            }else if (choice == 3) {
                System.out.println("Επιλέχθηκε Αναζήτηση");
                System.out.println();
            }



        } while (choice != 5);

        System.out.println("Thank you!");
    }
}
