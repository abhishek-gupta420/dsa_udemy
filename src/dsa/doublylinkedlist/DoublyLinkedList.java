package dsa.doublylinkedlist;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    /**
     *
     * @param nodeValue nodeValue
     * @return DoublyNode
     */
    public DoublyNode createDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = tail = newNode;
        size = 1;

        return head;
    }

//    Insertion in the doubly linked list

    public void insertDll(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;

        if (head == null) {
            createDLL(nodeValue);
            return;
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;

            }

            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    // traverse doubly linked list

    public void traverseDll() {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The DLL doesn't exists");
        }
        System.out.println();
    }

//    Reverse traversal in DLL
    public void reverseTraverseDLl() {
        if (head != null) {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" <- ");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("DLL doesn't exits");
        }
        System.out.println();
    }

//    searching for a node in DLL

    public boolean searchNode(int value) {
        if (head != null) {
            DoublyNode tmpNode = head;
            for (int i = 0; i < size; i++) {
                if (tmpNode.value == value) {
                    System.out.println("Node found @ location : " + i);
                    return true;
                }
                tmpNode = tmpNode.next;
            }
        }

        System.out.println("Node not found");
        return false;
    }


//    deleting the node from DLL

    public void deleteNodeDll(int loc) {
        if (head == null) {
            System.out.println("Dll doesn't exists");
            return;
        } else if (loc == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }
        } else if (loc >= size) {
            DoublyNode tmpNode = tail.prev;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
            } else {
                tmpNode.next = null;
                tail = tmpNode;
                size--;
            }
        } else {
//            delete from any specified loc
            DoublyNode tmpNode = head;
            for (int i =0; i < loc - 1; i++) {
                tmpNode = tmpNode.next;
            }
            tmpNode.next = tmpNode.next.next;
            tmpNode.prev = tmpNode;
            size--;

        }

    }


    //    delete entire Dll

    public void deleteDll() {
        DoublyNode tmpNode = head;
        for (int i = 0; i < size; i++) {
            tmpNode.prev = null;
            tmpNode = tmpNode.next;
        }
        head = null;
        tail = null;
        size = 0;
        System.out.println("DLL has been deleted !");
    }


}
