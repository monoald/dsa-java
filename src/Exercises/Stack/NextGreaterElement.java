package Exercises.Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4,7,3,4,8,1};
        int[] greater = NextGreaterElement.exec(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(greater));
    }

    public static int[] exec(int[] input) {
        var output = new int[input.length];
        var stack = new Stack<Integer>();

        for (int i = input.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() <= input[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                output[i] = -1;
            } else {
                output[i] = stack.peek();
            }
            stack.push(input[i]);
        }

        return output;
    }
}
