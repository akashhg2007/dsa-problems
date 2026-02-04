package switchcase;
import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the id ");
        int id =in.nextInt();
        String Department=in.next();
        System.out.println("enter the department");
        switch(id){
            case 1:
                System.out.println("Akash HG");
                break;

            case 2:
                System.out.println("pragna s");
                break;

            case 3:
                    System.out.println("enter department");

        switch (Department){
            case "IT":
                System.out.println("CSE");
                break;
            case "electric":
                    System.out.println("ECE");
                 break;

            default:
                    System.out.println("invalid candidate");
        }
    }
}
}
