package Arrays;
import java.sql.SQLOutput;
import java.util.*;

public class ArrayCC {
    static void main(String[] args) {
        int marks[] = new int[50];
        //int numbers[]={2,4,5,6,};
        //String fruits[]={"apple","mango","orange"};

        Scanner in = new Scanner(System.in);
        //int phy;
        //phy = in.nextInt();
        marks[0] = in.nextInt();//phy
        marks[1] = in.nextInt();//chem
        marks[2] = in.nextInt();//maths

        System.out.println("phy :" +marks[0]);
        System.out.println("chem :" +marks[1]);
        System.out.println("maths :" +marks[2]);


        //update maths marks

        marks[2]=marks[2]+4;
        System.out.println("maths :" +marks[2]);

        //percentage

        int percentage =(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage =" +percentage+"%");

        // array lengh

        System.out.println("lengh of the array"  + marks.length);


    }
}
