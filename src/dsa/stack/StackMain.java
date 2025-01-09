package dsa.stack;

public class StackMain {
    public static void main(String[] args) {
        Stack newStack = new Stack(5);
        System.out.println(newStack.isEmpty());
        System.out.println(newStack.isFull());
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);
        newStack.push(5);

        System.out.println(newStack.isEmpty());
        System.out.println(newStack.isFull());
        System.out.println(newStack);
        System.out.println(newStack.pop());
        System.out.println(newStack);
        System.out.println(newStack.peek());
        System.out.println(newStack.peek());
        newStack.delete();
        System.out.println(newStack);


    }
}
