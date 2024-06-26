package gr.aueb.cf.ch6;

public class MaxPositionApp {

    public static void main(String[] args) {
        int[] arr = {2, 456, 45, 2, 6, 324, 4353, 7, 21, 34, 546, 7, 3, 6};

        int maxPosition = 0;
        int maxValue = arr[maxPosition];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[maxPosition];
            }
        }

        System.out.printf("Max Value: %d, Max Position: %d", maxValue, maxPosition + 1);
    }
}