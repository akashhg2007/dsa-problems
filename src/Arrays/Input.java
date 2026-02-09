package Arrays;
import java.util.Scanner;

public class Input {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=23;
        arr[1]=237;
        arr[2]=5445;
        arr[3]=2435;
        arr[4]=76;
        //[23,237,5445,2435,76]
        System.out.println(arr[2]);
 //       System.out.println(arr[5]);// index out of bound error

        // input using for loops
        for (int i = 0; i <arr.length; i++) {
            arr[i] = in.nextInt();
            System.out.println(arr[i]);
        }
        {
            for(int num : arr){ // for every element in array , print the element
                System.out.println(num +" "); // here num represent element of the array
            }

        }
    }
}
