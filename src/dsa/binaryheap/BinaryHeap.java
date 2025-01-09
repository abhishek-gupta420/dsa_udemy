package dsa.binaryheap;

public class BinaryHeap {
    int[] arr;
    int sizeOfTree;

    public BinaryHeap(int sizeOfTree) {
        arr = new int[sizeOfTree + 1]; // + 1 because we will keep 0th index empty
        this.sizeOfTree = 0;
        System.out.println("A Binary Heap has been created of size " + sizeOfTree);
    }


//    isEmpty method

    public boolean isEmpty() {
        return sizeOfTree == 0 ? true : false;
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Binary heap is empty...");
            return null;
        }

        return arr[1];
    }

//    size of tree

    public Integer sizeOfBH() {
        return sizeOfTree;
    }

//    level order traversal

    public void levelOrder() {
        for (int i = 1; i <= sizeOfTree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//    Heapify method -> we will go from bottom to top

    public void heapifyBottomToTop(int index, String heapType) {
        int parent = index / 2;
        if (index <= 1) return;

        if (heapType.equalsIgnoreCase("Min")) {
            if (arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        } else if (heapType.equalsIgnoreCase("Max")) {
            if (arr[index] > arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }

        heapifyBottomToTop(parent, heapType);
    }


//    insert method

    public void insert(int value, String typeHeap) {
        arr[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapifyBottomToTop(sizeOfTree, typeHeap);
        System.out.println("value " + value + " is inserted in binary heap.");
    }

//    Heapify top to bottom -> for extracting value from heap

    public void heapifyTopToBottom(int index, String heapType) {
        int left = index * 2;
        int right = index * 2 + 1;
        int swapChild = 0;
        if (sizeOfTree < left) { // don't have any child
            return;
        }

        if (heapType.equalsIgnoreCase("Max")) {
            if (sizeOfTree == left) {
                if (arr[index] < arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {
//                if we have 2 children
                if (arr[left] > arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] < arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        } else if (heapType.equalsIgnoreCase("Min")) {
            if (sizeOfTree == left) {
                if (arr[index] > arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {
//                if we have 2 children
                if (arr[left] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] > arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        }
        heapifyTopToBottom(swapChild, heapType);
    }

//    extract head of heap method
    public int extractHeadOfBP(String helpType) {
        if (isEmpty()) {
            return -1;
        } else {
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1, helpType);
            return extractedValue;
        }
    }

//    delete entire binary heap
    public void deleteBinaryHeap() {
        arr = null;
        System.out.println("Binary heap has been successfully deleted 😀");
    }


}
