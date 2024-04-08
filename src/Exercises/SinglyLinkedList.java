package Exercises;

public class SinglyLinkedList {
    private ListNode head;

    public static void main(String[] args) {
        // Create
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // Connect the Nodes
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        // printSLL(sll.head);
        // int count = length(sll.head);
        // System.out.print("Length is: " + count);
        // insertFirst(sll, 6);
        // insertFirst(sll, 90);
        // sll.insertLast(5);
        // sll.insertLast(3);
        // sll.insertLast(84);
        // printSLL(sll.head);
    }
    private static class ListNode {
        private final int data; // Generic Type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private static void printSLL(ListNode sll) {
        ListNode current = sll;
        while(current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.print("null");
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
    private static void insertFirst(SinglyLinkedList sll, int newSllData) {
        ListNode newHead = new ListNode(newSllData);
        newHead.next = sll.head;
        sll.head = newHead;
    }
    private void insertLast(int data) {
        ListNode newNode = new ListNode(data);

        if (this.head.next == null) {
            this.head.next = newNode;
        }

        ListNode current = this.head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }
}
