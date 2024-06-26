package gr.aueb.cf.ch6;

public class EvensOnly {
    public static void main(String[] args) {
        int[] array = {2, 456, 45, 4, 6, 324, 4353, 7, 21, 34, 546, 11, 3, 12};

        for (int i =0; i < array.length; i++){
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
