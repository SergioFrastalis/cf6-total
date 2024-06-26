package gr.aueb.cf.ch2;

public class OutputApp {
    public static void main(String[] args) {
        int num = 10;
        long num2 = 20;

        System.out.println("Hello");
        System.out.print("Hello2");
        System.out.println();
        System.out.printf("Hello");

        System.out.println("Num is: " + num);
        System.out.printf("Num is %d", num);
        System.out.printf("Num is: %d, Num2 is: %d", num, num2);
    }
}
