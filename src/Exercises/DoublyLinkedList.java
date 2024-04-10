package Exercises;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertLast(1);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.insertLast(25);

        dll.print();
        dll.printFromTail();
    }

    public static class ListNode {
        private final int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty() {
        return this.length == 0;
    }
    public int length() {
        return this.length;
    }
    public void insertLast(int data) {
        ListNode newNode = new ListNode(data);

        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
            this.length++;
            return;
        }

        this.tail.next = newNode;
        newNode.prev = this.tail;
        this.tail = newNode;
        this.length++;
    }
}
