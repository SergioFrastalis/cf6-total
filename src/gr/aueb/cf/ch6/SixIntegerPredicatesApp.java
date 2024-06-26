package gr.aueb.cf.ch6;

import java.util.Scanner;

public class SixIntegerPredicatesApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int num6 = 0;
        boolean result1 = false;
        boolean result2 = false;
        boolean result3 = false;
        boolean result4 = false;
        boolean result5 = false;

        System.out.println("Please insert 6 integers from 1 to 49");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        num4 = in.nextInt();
        num5 = in.nextInt();
        num6 = in.nextInt();

        int[] nums = {num1, num2 , num3, num4, num5, num6};
        result1 = moreThanThreeEvens(nums);
        result2 = moreThanThreeOdds(nums);
        result3 = moreThanThreeConsecutive(nums);
        result4 = moreThanThreeSameLastDigit(nums);
        result5 = moreThanThreeSameTensRange(nums);
        System.out.println("More than three numbers are even is: " + result1);
        System.out.println("More than three numbers are odd is: " + result2);
        System.out.println("More than three numbers are consecutive is: " + result3);
        System.out.println("More than three numbers have the same last digit is: " + result4);
        System.out.println("More than three numbers in the same tens range is: " + result5);

    }

    public static boolean moreThanThreeEvens(int[] arr){
        if (arr == null) return false;
        int evens = 0;
        for (int item: arr) {
            if (item % 2 == 0) {
                evens++;
            }
        }
        return evens > 3;
    }

    public static boolean moreThanThreeOdds(int[] arr) {
        if (arr == null) return false;
        int odds = 0;
        for (int item: arr) {
            if (item %2 != 0) {
                odds++;
            }
        }
        return odds > 3;
    }

    public static boolean moreThanThreeConsecutive(int[] arr) {
        if (arr == null) return false;
        int consecutive = 0;
        for (int i = 0; i < 6; i++ ) {
            if(i + 1 < arr.length && arr[i+1] - arr[i] == 1) {
                consecutive++;
            }
        }
        return consecutive > 3;
    }

    public static boolean moreThanThreeSameLastDigit(int[] arr) {
        if (arr == null) return false;
        int samelastdigit = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] % 10 == arr[j] % 10){
                    samelastdigit++;
                }
            }
        }
        return samelastdigit > 3;
    }

    public static boolean moreThanThreeSameTensRange(int[] arr) {
        if (arr == null) return false;
        int sametensrange = 0;

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++){
                if(Math.abs((arr[i] / 10) - (arr[j] / 10)) == 0) {
                    sametensrange++;
                }
            }
        }
        return sametensrange > 3;
    }

}
