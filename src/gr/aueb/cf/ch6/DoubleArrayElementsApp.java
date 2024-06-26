package gr.aueb.cf.ch6;

public class DoubleArrayElementsApp {
    public static void main(String[] args) {
        int[] array = {2, 456, 45, 4, 6, 324, 4353, 7, 21, 34, 546, 11, 3, 12};
        int[] doubledArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            doubledArray[i] = array[i] * 2;

        }

        for (int i =0; i < array.length; i ++) {
            System.out.println(doubledArray[i]);
        }

    }
}
