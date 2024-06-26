package gr.aueb.cf.ch3;

import java.net.SocketOption;
import java.util.Scanner;

public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Please insert if it's raining ");
        isRaining = in.nextBoolean();

        System.out.println("Plase insert outside temperature");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
