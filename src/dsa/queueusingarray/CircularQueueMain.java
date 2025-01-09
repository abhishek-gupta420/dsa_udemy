package dsa.queueusingarray;

public class CircularQueueMain {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(4);
        System.out.println(circularQueue.isEmpty());
        System.out.println(circularQueue.isFull());
        circularQueue.enQueue(4);
        circularQueue.enQueue(3);
        circularQueue.enQueue(9);
        circularQueue.enQueue(90);
        circularQueue.enQueue(499);
        System.out.println(circularQueue);
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.deQueue());
        circularQueue.enQueue(98);
        System.out.println("---------------------------");
        System.out.println(circularQueue);
        System.out.println(circularQueue.peek());
        circularQueue.enQueue(88);
        System.out.println(circularQueue.peek());
        circularQueue.deleteQueue();
        System.out.println(circularQueue);

    }
}
