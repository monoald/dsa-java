package Exercises;

public class SinglyLinkedList {
    private ListNode head;

    public static void main(String[] args) {
        // Create
        SinglyLinkedList sllA = new SinglyLinkedList();
        sllA.insertLast(1);
        sllA.insertLast(4);
        sllA.insertLast(8);

        SinglyLinkedList sllB = new SinglyLinkedList();
        sllB.insertLast(3);
        sllB.insertLast(6);
        //sllB.insertLast(7);

        sllA.print();
        sllB.print();

        SinglyLinkedList sllC = new SinglyLinkedList();
        sllC.head = SinglyLinkedList.mergeTwoOrderLists(sllA.head, sllB.head);

        sllC.print();
        sllA.print();
        sllB.print();

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

        if (this.head == null) {
            this.head = newNode;
            return;
        }
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
    public ListNode deleteAt(int position) {
        if (position == 1) {
            ListNode toRemove = head;
            this.head = head.next;
            return toRemove;
        }

        int currentPosition = 1;
        ListNode currentNode = this.head;

        while (currentPosition < position - 1) {
            currentNode = currentNode.next;
            currentPosition++;

            if (currentNode.next == null) {
                throw new Error("Linked List Out of Bound");
            }
        }

        ListNode toRemove = currentNode.next;
        currentNode.next = toRemove.next;

        return toRemove;
    }
    public void delete(int data) {
        ListNode currentNode = this.head;
        ListNode previousNode = this.head;

        if (currentNode == null) {
            return;
        } else if (currentNode.data == data) {
            this.head = this.head.next;
            return;
        }

        while (currentNode.data != data) {
            if (currentNode.next == null) {
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        previousNode.next = currentNode.next;
    }
    public void insertInOrder(int data) {
        ListNode newNode = new ListNode(data);
        ListNode currentNode = this.head;
        ListNode previousNode = null;

        if (currentNode == null) {
            this.head = newNode;
            return;
        } else if (currentNode.next == null) {
            if (currentNode.data > data) {
                newNode.next = currentNode;
                this.head = newNode;
            } else {
                currentNode.next = newNode;
            }
            return;
        }

        if (currentNode.data > data) {
            newNode.next = this.head;
            this.head = newNode;
            return;
        }

        while (currentNode != null && currentNode.data <= data) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        newNode.next = currentNode;
        previousNode.next = newNode;
    }
    public void removeAllDuplicate() {
        if (this.head == null) {
            return;
        } else if (this.head.next == null) {
            return;
        }

        ListNode currentNode = this.head;

        while (currentNode.next != null) {
            if (currentNode.data == currentNode.next.data) {
                currentNode.next = currentNode.next.next;
                continue;
            }
            currentNode = currentNode.next;
        }
    }
    public boolean find(int data) {
        if (this.head == null) {
            return  false;
        }

        ListNode currentNode = this.head;

        while(currentNode != null) {
            if (currentNode.data == data) {
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }
    public void reverse() {
        if (this.head == null || this.head.next == null) {
            return;
        }
        ListNode previousNode = null;
        ListNode currentNode = this.head;
        ListNode nextNode;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;

        }
        this.head = previousNode;
    }
    public ListNode findMiddle() {
        if (this.head == null || this.head.next == null) {
            return this.head;
        } else if (this.head.next.next == null) {
            return this.head.next;
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }
    public ListNode findFromEnd(int position) {
        if (this.head == null) {
            return this.head;
        }

        if (position <= 0) {
            throw new IllegalArgumentException("Invalid value: n = " + position);
        }

        ListNode currentNode = this.head;
        ListNode distanceNode = this.head;
        int distance = 0;

        while (distance < position) {
            if (distanceNode == null) {
                throw new IllegalArgumentException(position + " Is greater than the number of nodes in the list");
            }
            distanceNode = distanceNode.next;
            distance++;
        }

        while (distanceNode != null) {
            currentNode = currentNode.next;
            distanceNode = distanceNode.next;
        }

        return currentNode;
    }
    public boolean isLoop() {
        if (this.head == null || this.head.next == null) {
            return false;
        }

        ListNode slowNode = this.head;
        ListNode fastNode = this.head;

        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            if (fastNode == slowNode) {
                return true;
            }
        }

        return false;
    }
    public ListNode HeadNodeOfLoop() {
        if (this.head == null || this.head.next == null) {
            return null;
        }

        ListNode slowNode = this.head;
        ListNode fastNode = this.head;

        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;

            if (fastNode == slowNode) {
                ListNode currentNode = this.head;

                while (fastNode != currentNode) {
                    fastNode = fastNode.next;
                    currentNode = currentNode.next;
                }

                return currentNode;
            }
        }

        return null;
    }
    public void unloop() {
        ListNode slowNode = this.head;
        ListNode fastNode = this.head;

        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            if (fastNode == slowNode) {
                ListNode currentNode = this.head;

                while (currentNode.next != slowNode.next) {
                    slowNode = slowNode.next;
                    currentNode = currentNode.next;
                }

                slowNode.next = null;
            }
        }
    }
    public static ListNode mergeTwoOrderLists(ListNode sllA, ListNode sllB) {
        ListNode currentC = new ListNode(0);
        ListNode newSll = currentC;

        while (sllA != null && sllB != null) {
            if (sllA.data <= sllB.data) {
                currentC.next = sllA;
                sllA = sllA.next;
            } else {
                currentC.next = sllB;
                sllB = sllB.next;
            }
            currentC = currentC.next;
        }

        if (sllA == null) {
            currentC.next = sllB;
        } else {
            currentC.next = sllA;
        }

        return newSll.next;
    }
}
