package dsa.queueusingarray;

import java.util.Arrays;

public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is successfully with size : " + size);
    }

    public boolean isFull() {
        return topOfQueue == arr.length - 1 ? true : false;
    }

    public boolean isEmpty() {
        return ((beginningOfQueue == -1) || (beginningOfQueue == arr.length)) ? true : false;
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is full.");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in queue");
        }
    }

    @Override
    public String toString() {
        return "QueueArray{" +
                "arr=" + Arrays.toString(arr) +
                ", topOfQueue=" + topOfQueue +
                ", beginningOfQueue=" + beginningOfQueue +
                '}';
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The queue is Empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = -1;
                topOfQueue = -1;

            }
            return result;
        }
    }

    public int peek() {
        return !isEmpty() ? arr[beginningOfQueue] : -1;
    }

    public void deleteQueue() {
        arr = null;
        System.out.println("Queue is deleted successfully");
    }

}
