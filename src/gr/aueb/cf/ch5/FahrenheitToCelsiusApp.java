package gr.aueb.cf.ch5;

public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {
        for (int i = -100; i <= 100; i += 10) {
            System.out.printf("%4d\u2109\t=\t%.2f\u2103\n", i, getCelsiusFromFahrenheit(i));
        }
    }

    public static double getCelsiusFromFahrenheit(double fahrenheitDegrees){
        return (fahrenheitDegrees -32) * 5/9;
    }
}
