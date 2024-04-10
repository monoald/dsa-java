package Exercises;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    public static void main (String[] args) {
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
        cll.createCircularLinkedList();
        cll.print();
        System.out.println("Length: " + cll.length);
        System.out.println("Last: " + cll.last.data);
        cll.insertLast(54);
        System.out.println("Length: " + cll.length);
        System.out.println("Last: " + cll.last.data);
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
        this.length = 4;
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
    public void insertFirst(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            this.last = newNode;
            length++;
        } else {
            newNode.next = this.last.next;
        }

        this.last.next = newNode;
        length++;
    }
    public void insertLast(int data) {
        ListNode newNode = new ListNode(data);

        if (this.last == null) {
            this.last = newNode;
            length++;
            return;
        }

        newNode.next = this.last.next;
        this.last.next = newNode;
        this.last = newNode;
        length++;
    }
}
