package Exercises;

public final class Arrays {
    private Arrays() {}
    public static int[] removeOddsFromArr(int[] arr) {
        int oddQuantity = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddQuantity++;
            }
        }

        int[] unevenNumbers = new int[oddQuantity];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                unevenNumbers[index] = arr[i];
                index++;
            }
        }

        return unevenNumbers;
    }

    public static void printIntArr (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
