package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * either or = 1/4 -> orange, both 1/4 -> red,
 */


public class TankApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isLTQuarterTank1 = false;
        boolean isLTQuarterTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert if tank 1 is LT quarter ");
        isLTQuarterTank1 = in.nextBoolean();

        System.out.println("Please insert if tank2 is LT quarter");
        isLTQuarterTank2 = in.nextBoolean();

        isRed  = (isLTQuarterTank1 && isLTQuarterTank2);
//        isOrange = (isLTQuarterTank1 && !isLTQuarterTank2) || (isLTQuarterTank2 && !isLTQuarterTank1);
        isOrange = isLTQuarterTank1 ^ isLTQuarterTank2; //(XOR coefficient)


    }
}
