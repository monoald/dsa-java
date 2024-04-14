package Exercises;

public class Stack {
    private ListNode top;
    private int length;

    public static void main(String[] args) {
        var stack = new Stack();
        stack.push(8);

        System.out.println("TOP: " + stack.top.data);
        System.out.println("LENGTH: " + stack.length);
    }

    public Stack () {}
    public Stack (int data) {
        this.top = new ListNode(data);
        this.length = 1;
    }

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void push(int data) {
        var newNode = new ListNode(data);
        newNode.next = this.top;
        this.top = newNode;
        length++;
    }
}
