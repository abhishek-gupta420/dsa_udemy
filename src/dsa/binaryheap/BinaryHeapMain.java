package dsa.binaryheap;

public class BinaryHeapMain {
    public static void main(String[] args) {

        BinaryHeap binaryHeap = new BinaryHeap(50);
        binaryHeap.peek();
        System.out.println();
        binaryHeap.sizeOfBH();
        binaryHeap.levelOrder();
        binaryHeap.insert(10, "Min");
        binaryHeap.insert(5, "Min");

        binaryHeap.insert(15, "Min");

        binaryHeap.insert(1, "Min");
        binaryHeap.levelOrder();
//
//        binaryHeap.insert(10, "Max");
//        binaryHeap.insert(5, "Max");
//
//        binaryHeap.insert(15, "Max");
//
//        binaryHeap.insert(1, "Max");
//        binaryHeap.levelOrder();
        System.out.println();
        binaryHeap.extractHeadOfBP("Min");
        binaryHeap.levelOrder();
        binaryHeap.deleteBinaryHeap();

    }


//
}
