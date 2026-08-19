package Arrays;

public class GetLargest {
    public static int GetLargest(int number[]){
        int largest = Integer.MIN_VALUE; //largest
        int smallest = Integer.MAX_VALUE; //smallest
        for (int i = 0; i < number.length ; i++) {
            if(largest<number[i]) {
                largest = number[i];
            }
                // smallest
            if (smallest > number[i]) {
                    smallest = number[i];
            }
        }
        System.out.println("the smallest number :" + smallest);
        return  largest;
    }
    static void main(String[] args) {
        int number[] = { 1,5,7,4,2 };
        System.out.println("the largest number is : "  +GetLargest(number));

    }
}
