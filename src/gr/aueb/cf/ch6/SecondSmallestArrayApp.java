package gr.aueb.cf.ch6;

public class SecondSmallestArrayApp {

    public static void main(String[] args) {
        int[] arr = {2, 456, 45, 4, 6, 324, 4353, 7, 21, 34, 546, 7, 3, 6};

        int minPosition = 0;
        int minValue = arr[minPosition];
        int newminPosition = 1;
        int newminValue = arr[newminPosition];



        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[minPosition];
            }
        }
         int temp = arr[0];
         arr[0] = arr[minPosition];
         arr[minPosition] = temp;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < newminValue) {
                newminPosition = i;
                newminValue = arr[newminPosition];
            }
        }


        System.out.printf("Second Min Value: %d, Second Min Position: %d", newminValue, newminPosition + 1);
    }
}
