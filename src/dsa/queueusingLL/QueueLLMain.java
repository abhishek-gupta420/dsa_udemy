package dsa.queueusingLL;

public class QueueLLMain {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        System.out.println(queue.isEmpty());
        queue.enQueue(5);
        queue.enQueue(8);
        queue.enQueue(9);
        System.out.println(queue.isEmpty());
        queue.traveerseQueue();
        System.out.println(queue.deQueue());
        queue.traveerseQueue();
        System.out.println(queue.deQueue());
        queue.traveerseQueue();
        System.out.println(queue.deQueue());
        queue.traveerseQueue();
        System.out.println(queue.deQueue());
        queue.traveerseQueue();
        queue.enQueue(5);
        queue.enQueue(8);
        queue.enQueue(9);
        System.out.println(queue.peek());

        queue.deleteQueue();




    }
}
