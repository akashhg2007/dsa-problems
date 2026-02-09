package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        // array of primitive
        arr[0]=23;
        arr[1]=237;
        arr[2]=5445;
        arr[3]=2435;
        arr[4]=76;
        //[23,237,5445,2435,76]
        System.out.println(Arrays.toString(arr)); // best way to print the array
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
        // array of object
        String[] str = new String[4];
        for (int i = 0; i < str.length ; i++) {
            str[1]=in.next();

        }
        System.out.println(Arrays.toString(arr));
        // modify
        str[1]="Akash";
        System.out.println(Arrays.toString(str));

    }
}
