package Arrays;

public class Reverse {
    static void revers (int[] numbers) {
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) {

            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    static void main(String[] args) {
        int numbers[] = {3, 5, 6, 8, 9, 5};
        revers(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
