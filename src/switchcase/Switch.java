package switchcase;
import java.util.Scanner;

public class Switch {
    static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("enter the fruits name here :");
        String fruit = in.next();
         switch(fruit){
             case "apple":
                 System.out.println("a red sweet fruit");
                 break;
             case "mango":
                 System.out.println("a king of fruits");
                 break;
             case "banana":
                 System.out.println("a small fruit");
                 break;
             default:
                 System.out.println("invalid fruit");
        }
    }
}
