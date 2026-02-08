package methods;
import  java.util.Scanner;

public class Primenumber {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if (n%c==n){
                return false;
            }
            c++;
        }
        if(c*c>n){
            return true;
        }
        return false;
    }
}
