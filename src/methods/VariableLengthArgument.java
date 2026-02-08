package methods;
// variable length argument

import java.util.Arrays;

public class VariableLengthArgument {
    public static void main(String[] args) {
        fun(2,4,6,8,56,3);
        multiple(2,4,6,"Akash","pragna");
        System.out.println();
    }

    static void multiple(int a,int b, int c, String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
