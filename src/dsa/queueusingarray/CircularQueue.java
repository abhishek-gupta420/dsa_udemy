package dsa.queueusingarray;

import java.util.Arrays;

public class CircularQueue {
    int[] arr;
    int topOfTheQueue;
    int beginningOfTheQueue;

    int size;

    public CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.topOfTheQueue = -1;
        this.beginningOfTheQueue = -1;
        System.out.println("The queue successfully created with the size : " + size);
    }

    public boolean isEmpty() {
        return topOfTheQueue == -1 ? true : false;
    }

    public boolean isFull() {
        if (topOfTheQueue + 1 == beginningOfTheQueue) {
            return true;
        } else if (beginningOfTheQueue == 0 && topOfTheQueue + 1 == size) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is full");
        } else if (isEmpty()) {
            beginningOfTheQueue = 0;
            topOfTheQueue++;
            arr[topOfTheQueue] = value;
            System.out.println("The " + value + " Successfuly Inserted in the Queue..");
        } else {
            if (topOfTheQueue + 1 == size) {
                topOfTheQueue = 0;
            } else {
                topOfTheQueue++;
            }
            arr[topOfTheQueue] = value;
            System.out.println("The " + value + " Successfuly Inserted in the Queue..");
        }

    }

    /**
     * This method is used to delete element from the front of the queue.
     * @return int
     */
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
            return -1;
        } else {
            int result = arr[beginningOfTheQueue];
            arr[beginningOfTheQueue] = 0;
            if (beginningOfTheQueue == topOfTheQueue) {
                beginningOfTheQueue = topOfTheQueue = -1;
            } else if (beginningOfTheQueue + 1 == size) {
                beginningOfTheQueue = 0;
            } else {
                beginningOfTheQueue++;
            }
            return result;
        }

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The Circular queue is Empty");
            return -1;
        } else {
            return arr[beginningOfTheQueue];
        }
    }

    public void deleteQueue() {
        arr = null;
        System.out.println("The Queue is deleted successfully.");
    }



    @Override
    public String toString() {
        return "CircularQueue{" +
                "arr=" + Arrays.toString(arr) +
                ", topOfTheQueue=" + topOfTheQueue +
                ", beginningOfTheQueue=" + beginningOfTheQueue +
                ", size=" + size +
                '}';
    }
}
