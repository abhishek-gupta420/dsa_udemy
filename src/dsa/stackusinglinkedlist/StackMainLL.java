package dsa.stackusinglinkedlist;

public class StackMainLL {

    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(0);
        stack.push(2);
        stack.push(3);
        stack.push(6);
        System.out.println("Stack peek : " + stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.deleteStack();
        System.out.println(stack);

//        System.out.println(stack);

    }
}
