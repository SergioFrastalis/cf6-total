package gr.aueb.cf.ch3;

public class Sum10 {
    public static void main(String[] args) {
        int i = 1;
        int sum=0;

        while (i <= 10){
            sum = sum + i;
            i++;
        }
        System.out.print(sum);
    }
}
