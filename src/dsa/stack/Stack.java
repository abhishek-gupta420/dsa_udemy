package dsa.stack;

import java.util.Arrays;

public class Stack {

    int arr[];
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The Stack is created with size of : " + size);
    }

    public boolean isEmpty() {
        return topOfStack == -1 ? true : false;
    }

    public boolean isFull() {
        return topOfStack == arr.length - 1 ? true : false;
    }


    public void push(int value) {
        if (isFull()) {
            System.out.println("The Stack is full..");
        } else {
            arr[++topOfStack] = value;
            System.out.println("The value is successfully inserted @ position : " + topOfStack);
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("The Stack is empty");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    public void delete() {
        arr = null;
        System.out.println("The stack is deleted successfully..");
    }

    @Override
    public String toString() {
        return "Stack{" +
                "arr=" + Arrays.toString(arr) +
                ", topOfStack=" + topOfStack +
                '}';
    }
}
