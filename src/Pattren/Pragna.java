package Pattren;
import java.util.*;

public class Pragna {
    static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of lines:");
         int n = in.nextInt();
        int count =0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i+1; j++) {
                count ++;
                System.out.print(count+ " ");

            }
            System.out.println();
        }
    }
}
