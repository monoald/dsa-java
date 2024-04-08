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
    public static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }
    public static void zeroLast(int[] arr) {
        int index = 0;
        boolean startMove = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && !startMove) {
                index = i;
                startMove = true;
            } else if (startMove && arr[i] != 0) {
                arr[index] = arr[i];
                arr[i] = 0;
                index++;
            }
        }
    }
    public static int[] resize(int[] arr, int size) {
        int[] resized = new int[size];

        for (int i = 0; i < arr.length; i++) {
            resized[i] = arr[i];
        }

        return resized;
    }
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;

        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }

        return sum;
    }
    public static boolean isPalindrome(String text) {
        char[] arr = text.toCharArray();
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
