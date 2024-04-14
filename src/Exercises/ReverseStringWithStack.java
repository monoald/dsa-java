package Exercises;

import java.util.Stack;

public class ReverseStringWithStack {
    public static void main(String[] args) {
        var name = "Berlin";
        System.out.println(name);
        System.out.println(reverseString(name));
    }

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            stack.push(charArr[i]);
        }
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = stack.pop();
        }

        return new String(charArr);
    }
}
