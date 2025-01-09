package dsa.queueusingLL;

import dsa.stackusinglinkedlist.SinglyLinkedList;

import java.util.LinkedList;
import java.util.List;

public class QueueLinkedList {
    SinglyLinkedList list;

    public QueueLinkedList() {
        list = new SinglyLinkedList();
        System.out.println("The Queue is created successfully.");
    }

    public boolean isEmpty() {
        if (list.head == null) {
            System.out.println("The list is Empty.");
            return true;
        } else {
            return false;
        }
    }

//    enqueue method

    public void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully inserted value in the queue.");
    }

    //dequeue

    public int deQueue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        } else {
            value = list.head.value;
            list.deletionOfNode(0);
        }
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        } else {
            return list.head.value;
        }
    }

    public void deleteQueue() {
        list.head = null;
        list.tail = null;
        System.out.println("The queue is successfullyu deleted");

    }


    public void traveerseQueue() {
        list.traverseSinglyLinkedList();
    }

}
