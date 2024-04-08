package Exercises;

public class SinglyLinkedList {
    private ListNode head;

    public static void main(String[] args) {
        // Create
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(8);
//        ListNode fourth = new ListNode(11);

        // Connect the Nodes
//        sll.head.next = second;
//        second.next = third;
//        third.next = fourth;

        sll.print();
        System.out.println(sll.deleteLast().data);
        sll.print();

    }
    private static class ListNode {
        private final int data; // Generic Type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private void print() {
        ListNode current = this.head;
        while(current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
    }
    private static int length(ListNode sll) {
        int count = 0;
        ListNode current = sll;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
    private void insertFirst(int data) {
        ListNode newHead = new ListNode(data);
        newHead.next = this.head;
        this.head = newHead;
    }
    private void insertLast(int data) {
        ListNode newNode = new ListNode(data);

        if (this.head.next == null) {
            this.head.next = newNode;
            return;
        }

        ListNode current = this.head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }
    public void insert(int position, int data) {
        if (position == 1) {
            insertFirst(data);
            return;
        }

        ListNode newNode = new ListNode(data);
        ListNode currentNode = this.head;
        int currentPosition = 1;

        while (currentPosition < position - 1) {
            if (currentNode.next == null) {
                throw new Error("Linked List Out of Bound.");
            }
            currentNode = currentNode.next;
            currentPosition++;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }
    public ListNode deleteFirst() {
        if (this.head == null) {
            return null;
        }

        ListNode first = this.head;
        this.head = this.head.next;
        first.next = null;

        return first;
    }
    public ListNode deleteLast() {
        if (this.head == null || this.head.next == null) {
            return head;
        }

        ListNode currentNode = this.head;

        while (currentNode.next != null && currentNode.next.next != null) {
            currentNode = currentNode.next;
        }

        ListNode last = currentNode.next;
        currentNode.next = null;

        return last;
    }
}
