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
    }

    private static class ListNode {
        private int data; // Generic Type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
