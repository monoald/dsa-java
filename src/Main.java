public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,2,7,3,8,0};
        int[] unevenNumbers = removeOddsFromArr(arr);
        printIntArr(unevenNumbers);
    }

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