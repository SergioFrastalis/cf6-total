//package gr.aueb.cf.ch6;
//
//public class ShallowDeepCopyApp {
//
//    public static void main(String[] args) {
//        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
////        int[][] gridCopyRef = copyReference(grid);
////
////        gridCopyRef[0][0] = 100;
////        traverse(grid);
//
//        int[][] gridShallowCopy = shallowCopy(grid);
//        gridShallowCopy[0][0] = 200;
//        traverse(grid);
//
//    }
//    public static int[][] copyReference(int[][] arr){
//        return arr;
//    }
//
//    public static void traverse(int[][] arr) {
//        for (int[] row : arr) {
//            for (int col : row) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void deepCopy(int[][] arr){
//        int[][] arraytoReturn = new int[arr.length][];
//    }
//}
