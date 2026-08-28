package Arrays;
import java.util.*;

public class BinarySearch {
    public static int BinarySeacrh(int number[], int key) {
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            //comparison
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
}


    public static void main(String[] args) {
    int number[] = {23,45,67,89,99};
    int key = 89;
        System.out.println("the key fount at :" +BinarySeacrh(number,key));
    }
}
