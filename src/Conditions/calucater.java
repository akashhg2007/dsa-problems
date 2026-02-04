package Conditions;
import java.util.Scanner;

public class calucater {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.println("enter the operators :");
            char op=in.next().trim().charAt(0);
            if(op=='+' || op=='-'|| op=='*' || op=='/'){
                System.out.println("enter the two numbers:");
                int a=in.nextInt();
                int b=in.nextInt();

                if(op=='+'){
                    ans=a+b;
                }
                if(op=='-'){
                    ans=a-b;
                }
                if(op=='*'){
                    ans=a*b;
                }
                if(op=='/'){
                    ans=a/b;
                }

            }
            else{
                System.out.println("invalid input");

            }
            System.out.println(ans);
        }

    }

}
