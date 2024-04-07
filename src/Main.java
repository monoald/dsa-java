import Exercises.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,5,2,7,3,8};

        // int[] oddNumbers = Arrays.removeEven(arr);
        // Arrays.reverse((arr));
        // Arrays.printInt(arr);
        // int min = Arrays.min(arr);
        int secondMax = Arrays.secondMax(arr);
        System.out.print("Second max number: " + secondMax);
    }
}