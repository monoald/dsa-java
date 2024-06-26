package Exercises;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(1);
        dll.insertFirst(10);
        dll.insertFirst(15);
        dll.insertFirst(25);

        dll.print();
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
    public void insertFirst(int data) {
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
    public ListNode deleteFirst() {
        ListNode firstNode = this.head;
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else if (firstNode.next == null) {
            this.head = null;
            this.length--;
            return firstNode;
        }

        firstNode.next.prev = null;
        this.head = firstNode.next;
        firstNode.next = null;
        this.length--;

        return firstNode;
    }
    public ListNode deleteLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        ListNode lastNode = tail;

        if (this.tail == this.head) {
            this.head = null;
        } else {
            tail.prev.next = null;
        }

        this.tail = lastNode.prev;
        lastNode.prev = null;
        this.length--;

        return lastNode;
    }
}
