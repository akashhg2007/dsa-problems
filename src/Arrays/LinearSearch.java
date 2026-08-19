package Arrays;

public class LinearSearch {
    public static int linearSearch(int num[] , int key) {

        for (int i = 0; i <num.length ; i++) {
            if( num[i] == key){
                return i;
            }
        }
         return -1;
    }

    static void main(String[] args) {
        int num[] = {34,54,22,45,27,98};
        int key = 22;

        int index = linearSearch(num ,key);
        if(index == -1){
            System.out.println("NOT found");
        }
        else{
            System.out.println("key is at index "  +index);
        }
    }
}
