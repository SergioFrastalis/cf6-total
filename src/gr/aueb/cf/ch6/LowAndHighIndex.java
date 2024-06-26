package gr.aueb.cf.ch6;

import java.util.Scanner;

public class LowAndHighIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the key to search for: ");
        int key = scanner.nextInt();
        int[] array = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int[] result = getLowAndHighIndexOf(array, key);

        if (result[0] == -1) {
            System.out.println("Key " + key + " not found in the array.");
        } else {
            System.out.println("{" + result[0] + ", " + result[1] + "}");
        }

    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key){
        int[] queue = new int[arr.length];
        int top = -1;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                queue[++top] = i;
            }
        }

        int firstElement = queue[0];
        int lastElement = queue[top];

        return new int[]{firstElement, lastElement};

    }

}
