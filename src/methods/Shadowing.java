package methods;

public class Shadowing {
    static int x =90; // this will be shadowed at line 9

    static void main(String[] args) {
        System.out.println(x); //90
//  scope will begin when value is initialised

        int x = 40; // the class variable at line 4 is shadowed by this
        System.out.println(x); //40 //shadowing
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
