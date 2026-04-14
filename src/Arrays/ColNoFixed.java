package Arrays;

public class ColNoFixed {
    static void main(String[] args) {
        int[][] arr ={
                {2,4,5,3},
                {4,5},
                {4,5,8}
        };
        for (int row = 0; row < arr.length ; row++) {
            for(int col =0 ;col<arr[row].length;col++){
                System.out.print(arr[row][col]+ " ");

            }
            System.out.println();

        }
    }
}
