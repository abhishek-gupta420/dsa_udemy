package dsa.stackusinglinkedlist;

public class Stack {
    SinglyLinkedList linkedList;

    public Stack() {
        linkedList = new SinglyLinkedList();
    }

    public void push(int value) {
        linkedList.insertInLinkedList(value, 0);
        System.out.println("Inserted value successfully in Stack");
    }

    public boolean isEmpty() {
        return linkedList.head == null ? true : false;
    }

    public int pop() {
        int result  = -1;

        if (isEmpty()) {
            System.out.println("The Stack is Empty");
        } else {
            result = linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
        return result;
    }

    public int peek() {
        return isEmpty() ? -1 : linkedList.head.value;
    }

    public void deleteStack() {
        linkedList.head = null;
        System.out.println("The Stack is deleted!");
    }
    @Override
    public String toString() {
        return "Stack{" +
                "linkedList=" + linkedList +
                '}';
    }
}
