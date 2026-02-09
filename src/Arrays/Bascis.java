package Arrays;

public class Bascis {
    static void main(String[] args) {
        //Q: store a roll number in an array
        int a = 10;
        //Q: store a person's name
        String name = "akash";

        //Q store 5 roll number
        int rno1 = 23;
        int rno2 = 73;
        int rno3 = 73;
        int rno4 = 28;
        int rno5 = 43;

        //for array
        //syntax is
        //datatype[] variable_name = new datatype[size];
        // store 5 roll number

        int[] rnos = new int[5];
        // or direct
        int[] rnos2 = {23, 54, 78, 90, 34};

        int[] ros; // declaratrion of array , ros is getting defined in the stack
        ros = new int[5]; // initialisation : actually here object is being created in the in the memory (heap)
       // System.out.println(ros[4]);

        String[] arr =new String[5];
        System.out.println(arr[3]);


    }
}

