package gr.aueb.cf.ch5;

/*
* Adds 2 integers by using a method*/

public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;

        result = AddApp.add(a, b);

        System.out.printf("%d + %d = %d", a, b, result);

    }

    public static int add(int a, int b){
//        int result = 0;
//

//        result = a + b;
//
//        return result;
        return a + b;
    }
}
