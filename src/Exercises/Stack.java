package Exercises;

import java.util.EmptyStackException;

public class Stack {
    private ListNode top;
    private int length;

    public static void main(String[] args) {
        var stack = new Stack();
        stack.push(8);
        stack.push(1);

        System.out.println("TOP: " + stack.top.data);
        System.out.println("LENGTH: " + stack.length);
        stack.print();
    }

    public Stack () {}
    public Stack(int data) {
        this.top = new ListNode(data);
        this.length = 1;
    }

    private class ListNode {
        private final int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void print() {
        var currentNode = this.top;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ---> ");
            currentNode = currentNode.next;
        }

        System.out.println("null");
    }
    public int length() {
        return this.length;
    }
    public boolean isEmpty() {
        return this.length == 0;
    }
    public void push(int data) {
        var newNode = new ListNode(data);
        newNode.next = this.top;
        this.top = newNode;
        length++;
    }
}
