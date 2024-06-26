package gr.aueb.cf.ch6;

public class OnlyPositivesApp {
    public static void main(String[] args) {
        int[] array = {2, 456, 45, 4, 6, 324, 4353, 7, 21, 34, 546, 11, 3, -12};
        boolean allPositives = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                allPositives = false;
                break;
            }
        }

        System.out.println("There are only positives: " + allPositives);

    }
}
