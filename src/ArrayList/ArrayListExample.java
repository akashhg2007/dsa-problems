package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>();
     /*   // add
        list.add(34434);
        list.add(453);
        list.add(5);
        list.add(52352);

        //avilable
        System.out.println(list.contains(5));
        // change or set or update

        list.set(0,99);

        //remove
        list.remove(2);
     */
        //input 
        for (int i = 0; i <5 ; i++) {
            list.add(in.nextInt());
            
        }
        System.out.println(list);


    }

}
