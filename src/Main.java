import Exercises.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,9,3,10};

        // int[] oddNumbers = Arrays.removeEven(arr);
        // Arrays.reverse((arr));
        // Arrays.printInt(arr);
        // int min = Arrays.min(arr);
        // int secondMax = Arrays.secondMax(arr);
        // Arrays.zeroLast(arr);
        arr = Arrays.resize(arr, 8);
        Arrays.printInt(arr);
    }
}