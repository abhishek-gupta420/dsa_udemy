package dsa.circulardoublylinkedlist;

public class CdllMain {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCdll(2);
//        System.out.println(cdll.head.value);
        cdll.insertNode(1, 0);
        cdll.insertNode(10, 2);
        cdll.insertNode(40, 6);
        cdll.insertNode(50, 3);
//        System.out.println(cdll.head.value);
//        System.out.println(cdll.head.next.value);
//        System.out.println(cdll.head.next.next.value);
        cdll.traverseCdll();
        System.out.println("Size : " + cdll.size);
        cdll.reverseTraversalCdll();
        System.out.println();
        cdll.searchNode(40);

        cdll.traverseCdll();

        cdll.deleteNode(9);

        cdll.traverseCdll();

        cdll.deleteEntireCdll();
        cdll.traverseCdll();

    }




}