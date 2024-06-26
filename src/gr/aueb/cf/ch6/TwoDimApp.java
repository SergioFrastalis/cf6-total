package gr.aueb.cf.ch6;

public class TwoDimApp {

    public static void main(String[] args) {

        int[][] arr = new int[2][3];
        arr[0][2] = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr2 = {{1,2},
                        {3,4},
                        {5,6}
        };

        System.out.println();
        for (int[] row: arr2) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        int[][] arr3;
        arr3 = new int[][] {{1, 2, 3}, {4, 5, 6}};
    }
}
