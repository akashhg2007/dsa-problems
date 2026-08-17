package Arrays;
import java.util.*;
public class PassingArgument {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 3;
        }
    }

    public static void main (String args[]){
            int marks[] = {34, 67, 35};
            update(marks);
            
            //print our marks
            for (int i = 0; i <marks.length  ; i++) {
                System.out.println(marks[i]+" ");
                
            }
            System.out.println( " ");

        }

    }


