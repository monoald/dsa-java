package Exercises;

public final class Arrays {
    private Arrays() {}
    public static int[] removeEven(int[] arr) {
        int oddQuantity = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddQuantity++;
            }
        }

        int[] oddNumbers = new int[oddQuantity];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddNumbers[index] = arr[i];
                index++;
            }
        }

        return oddNumbers;
    }
    public static void printInt (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] reverse(int[] arr) {
        int[] reverseArr = new int[arr.length];
        int index = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            reverseArr[index] = arr[i];
            index--;
        }

        return reverseArr;
    }
}
