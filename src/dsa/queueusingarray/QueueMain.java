package dsa.queueusingarray;

public class QueueMain {
    public static void main(String[] args) {

        QueueArray queue = new QueueArray(3);



        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isEmpty());

        queue.enQueue(44);
        queue.enQueue(43);

        queue.enQueue(40);
        queue.enQueue(46);
        queue.enQueue(94);
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.enQueue(94);

        System.out.println(queue);
        System.out.println(queue.peek());
        queue.deleteQueue();
        System.out.println(queue);


    }
}
