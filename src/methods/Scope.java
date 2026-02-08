package methods;

public class Scope {
    static void main(String[] args) {
        int a = 10; //
        int b = 20;
        int c = 45;
        {
//            int  a=79; already initialised outside the block in the same method, hence you cannot initialise again
            c =99; // reassing the origin ref value to same other value
            System.out.println(c);
            // values initialised in this block, will remain in block
        }
 //       System.out.println(c);//cannot use outside the block

//        Scoping in for loop
        for (int i = 0; i <4 ; i++) {
            System.out.println(i);
            int num = 20;
           //int a=45; cannot initialised out side variable again, but we can change the value of "a"
        }
    }
    static void ramdom(int marks){
        int num =45;
        System.out.println(num);
        System.out.println(marks);
    }

}    // first initialising and next reassing