package Exercises;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertStart(1);
        dll.insertStart(10);
        dll.insertStart(15);
        dll.insertStart(25);

        dll.print();
        dll.printFromTail();
        System.out.println(dll.tail.data);
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
    public void insertEnd(int data) {
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
    public void insertStart(int data) {
        ListNode newNode = new ListNode(data);

        if(isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
            this.length++;
            return;
        }

        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;
        this.length++;
    }
    public void print() {
        ListNode currentNode = this.head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ---> ");
            currentNode = currentNode.next;
        }

        System.out.println("null");
    }
    public void printFromTail() {
        ListNode currentNode = this.tail;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ---> ");
            currentNode = currentNode.prev;
        }

        System.out.println("null");
    }
}
