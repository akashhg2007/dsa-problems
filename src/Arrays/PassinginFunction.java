package Arrays;

import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int[] nums={23,67,98,54,67,};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
         arr[0]=78;
    }
}
