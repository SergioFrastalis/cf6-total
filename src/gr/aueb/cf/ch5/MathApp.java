package gr.aueb.cf.ch5;

public class MathApp {

    public static void main(String[] args) {
        double d = 3.45;

        System.out.printf("%.2f: ceil: %d, floor: %d", d, getCeil(d), getFloor(d));
//        System.out.println("Random value between 1-100: " + getRandom(1, 100));
    }

    public static int getCeil(double num){
        return (int) Math.ceil(num);
    }

    public static int getFloor(double num){
        return (int) Math.floor(num);
    }

}
