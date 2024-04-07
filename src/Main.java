import Exercises.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,2,7,3,8,0};
        int[] unevenNumbers = Arrays.removeOddsFromArr(arr);
        Arrays.printIntArr(unevenNumbers);
    }
}