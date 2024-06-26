package gr.aueb.cf.ch5;

import java.util.Scanner;

public class CalculateRectangleAreaApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;

        System.out.println("PLease insert two doubles");
        width = in.nextDouble();
        height = in.nextDouble();

        area = calculateArea(width, height);
        System.out.println("Area: " + area);
    }

    public static double calculateArea( double width, double height) {
        return width*height;
    }
}
