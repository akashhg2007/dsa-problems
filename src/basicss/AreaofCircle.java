package basicss;
import java.util.Scanner;

public class AreaofCircle {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  the radius of circle r:");
        int r = in.nextInt();
        float area= (float) 3.14*r*r;
        System.out.println(area);
    }
}
