package Exercises.Stack;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        var str = "{()";
        System.out.println("Is balanced: " + BalancedBrackets.exec(str));
    }

    public static boolean exec(String str) {
        var charArr = str.toCharArray();
        var stack = new Stack<Character>();

        for (int i = str.length() - 1; i >= 0; i--) {
            if (charArr[i] == ')' || charArr[i] == ']' || charArr[i] == '}') {
                stack.push(charArr[i]);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (
                        stack.peek() == ')' && charArr[i] == '(' ||
                        stack.peek() == '}' && charArr[i] == '{' ||
                        stack.peek() == ']' && charArr[i] == '['
                ) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
