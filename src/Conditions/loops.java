package Conditions;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
       /* char c1='*';
                for(int i=0;i<6;i++){
                   for(int j=1 ;j<=i+1;j++){
                        System.out.print(c1);
                    }
                    System.out.println();
                }
    }
}
        */
       /* Scanner in = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = in.nextInt();

        for (int num = 1; num <=n; num++) {
            //System.out.print(" " +num);
            System.out.println("hello world!!");
        }

        */

        Scanner in = new Scanner (System.in);
        System.out.println("enter the first number:");
        int a = in.nextInt();
        System.out.println("enter the second number ");
        int b = in.nextInt();
        System.out.println("enter the third number ");
        int c = in.nextInt();

        if(a>b){
            System.out.println("a is the largest number");
        }
        else if(b>c){
            System.out.println("b is the largest number");
            }
        else{
            System.out.println("c is the largest number:");
        }
    }
}

