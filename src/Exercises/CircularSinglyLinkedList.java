package Exercises;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    public static void main (String[] args) {
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
        cll.createCircularLinkedList();
        cll.print();
    }
    private static class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }
    public int length() {
        return this.length;
    }
    public boolean isEmpty() {
        return this.length == 0;
    }
    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        this.last = fourth;
    }
    public void print() {
        if (last == null) {
            return;
        }
        ListNode currentNode = last.next;

        while (currentNode != last) {
            System.out.print(currentNode.data + " ---> ");
            currentNode = currentNode.next;
        }

        System.out.println(currentNode.data);
    }
}
