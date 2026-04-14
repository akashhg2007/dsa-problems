package Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int[][] arr ={
         //       {1,4,6},//0th index
         //       {4,3},//1st index
         //       {7,8,9} //2nd index -> arr[2]={7,8,9}
        //};
       // for (int i = 0; i <3; i++) {
        int[][] arr=new int[3][2];
        //System.out.println(arr.length);// no of rows

        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col] = in.nextInt();

                System.out.print(arr[row][col] + " ");

            }

            }

        }

        }
      // System.out.println(Arrays.toString(arr));
    


