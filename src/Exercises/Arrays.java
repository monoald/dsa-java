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
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int temp;

        while (start < end) {
            temp = arr[start];

            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static int min(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
