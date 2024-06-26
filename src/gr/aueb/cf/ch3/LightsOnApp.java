package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int speed = 0;
        boolean isRaining = false;
        boolean isDark= false;
        boolean LightsOn = false;

        System.out.println("Please insert if it's raining ");
        isRaining = in.nextBoolean();

        System.out.println("Please insert speed value in km/h");
        speed = in.nextInt();

        System.out.println("Please insert if it's dark ");
        isDark = in.nextBoolean();

        LightsOn = (isRaining && (speed > 50)) || (isRaining && isDark);

        System.out.println("Turning on lights " + LightsOn);

    }
}
