package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        int positionOfo = s.indexOf('o');
        int positionOfNextO = s.indexOf('o', 2);
        System.out.println("Position of o: " + positionOfo);
        System.out.println("Position of next o: " + positionOfNextO);

    }
}
