package gr.aueb.cf.ch6;

public class TraverseArray {

    public static void main(String[] args) {

        int[] ages = {20, 25, 22, 40};


        //simple for with index
        for(int i = 0; i < ages.length; i++){
            System.out.print(ages[i] + " ");
        }

        //enhanced for
        for (int age: ages){
            System.out.print(age + " ");
        }
    }
}
