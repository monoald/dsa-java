import Exercises.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,0,4,12};

        // int[] oddNumbers = Arrays.removeEven(arr);
        // Arrays.reverse((arr));
        // Arrays.printInt(arr);
        // int min = Arrays.min(arr);
        // int secondMax = Arrays.secondMax(arr);
        Arrays.zeroLast(arr);
        Arrays.printInt(arr);
    }
}