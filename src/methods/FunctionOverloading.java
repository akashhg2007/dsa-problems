package methods;

import java.util.Arrays;

public class FunctionOverloading {
    static void main(String[] args) {
        // when the two or more function have the same name
        // the overloading occur // but diffrent argument
        fun(3,5,76,98,56);
        fun("Akash h g");

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v) );

    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
