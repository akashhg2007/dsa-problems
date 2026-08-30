
package Arrays;

public class PrintSubArray {
    public static void printsubarray( int numbers[]){
        int ts=0;
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <j; k++) {
                    System.out.print(k);
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays is:- " +ts);
    }
    public static void main (String[] args){
        int numbers[]= {3,5,6,8,9,7};
        printsubarray(numbers);
    }

}
