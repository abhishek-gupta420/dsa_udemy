package dsa.circulardoublylinkedlist;

import dsa.doublylinkedlist.DoublyNode;

public class CircularDoublyLinkedList {
    public CircularDoublyNode head;
    public CircularDoublyNode tail;
    public int size;

//    create CDLL

    public CircularDoublyNode createCdll (int value) {
        head = new CircularDoublyNode();
        CircularDoublyNode newNode = new CircularDoublyNode();
        newNode.value = value;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    }

//    insertion method in CDLL

    public void insertNode(int value, int loc) {
        CircularDoublyNode newNode = new CircularDoublyNode();
        newNode.value = value;
        if (head == null) {
            createCdll(value);
            return;
        } else if (loc == 0) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        } else if (loc >= size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            CircularDoublyNode tmpNode = head;
            int index = 0;
            while (index < loc - 1) {
                tmpNode = tmpNode.next;
                index++;
            }
            newNode.prev = tmpNode;
            newNode.next = tmpNode.next;
            tmpNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

//    Traversing the circular doubly linked list

    public void traverseCdll() {
        if (head != null) {
            CircularDoublyNode tmpNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tmpNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tmpNode = tmpNode.next;
            }
        } else {
            System.out.println("CDLL doesn't exists!");
        }
        System.out.println();
    }

//    reverse traversal
    void reverseTraversalCdll() {

        if (head != null) {
            CircularDoublyNode tmpNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tmpNode.value);
                if (i != size - 1) {
                    System.out.print(" <- ");
                }
                tmpNode = tmpNode.prev;
            }
        } else {
            System.out.println("CDLL doesn't exists!");
        }
    }

    // searching in cdll

    boolean searchNode(int nodeValue) {
        if (head != null) {
            CircularDoublyNode tmpNode = head;

            for (int i = 0; i < size; i++) {
                if (tmpNode.value == nodeValue) {
                    System.out.println("Node found @ location : " + i);
                    return true;
                }

                tmpNode = tmpNode.next;
            }
        }
        System.out.println("Node not found.");
        return false;
    }



    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("C-DLL doesn't exists : ");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head.prev = null;
                head.next = null;
                tail = head = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size) {
            if (size == 1) {
                head.prev = null;
                head.next = null;
                tail = head = null;
                size--;
                return;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        } else {
            CircularDoublyNode tmpNode = head;
            for (int i = 0; i < location - 1; i++) {
                tmpNode = tmpNode.next;
            }
            tmpNode.next = tmpNode.next.next;
            tmpNode.next.prev = tmpNode;
            size--;
        }
    }


//    delete entire Cdll

    public void deleteEntireCdll() {
        CircularDoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("CDLL has been deleted Successfully : ");
    }
}
