package dsa.doublylinkedlist;

public class DllMain {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.createDLL(1);
        dll.insertDll(2, 0);
        dll.insertDll(3, 1);
        dll.insertDll(3, 7);
//        System.out.println(dll.head.value);
        dll.traverseDll();
        dll.reverseTraverseDLl();
        dll.searchNode(5);
        dll.searchNode(3);

        dll.deleteNodeDll(2);
        dll.traverseDll();
        dll.deleteDll();
        dll.traverseDll();
        dll.traverseDll();
        System.out.println("Dll size : " + dll.size);
    }

}
