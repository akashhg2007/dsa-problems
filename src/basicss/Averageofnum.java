package basicss;
import java.util.Scanner;

public class Averageofnum {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number A:");
        int a= in.nextInt();
        System.out.print("Enter the first number B:");
        int b= in.nextInt();
        System.out.print("Enter the first number C:");
        int c= in.nextInt();
        int Average = (a+b+c)/3;
        System.out.print("the Average of three numbers:");
        System.out.println(Average);
    }
}
