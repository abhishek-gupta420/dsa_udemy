package dsa.tree.binaryTreeUsingArray;

import java.util.Arrays;

public class BinaryTreeArr {
    String arr[];
    int lastUsedIndex;

    public BinaryTreeArr(int size) {
        arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Blank Binary Tree of size " + size + " Is created.");
    }

//    is tree full

    boolean isFull() {
        return arr.length - 1 == lastUsedIndex;
    }

// Insert method

    void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("The value of " + value + " is inserted.");
        } else {
            System.out.println("BT is full.");
        }
    }

//    preorder traversal

    public void preOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }

        System.out.print(arr[index] + " ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }

//    Inorder traversal

    public void inOrder(int index) {
        if (index > lastUsedIndex) return;

        inOrder(index * 2);
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1);

    }

//    Post Order Traversal

    public void postOrder(int index) {
        if (index > lastUsedIndex) return;

        postOrder(index * 2);
        postOrder(index * 2 + 1);
        System.out.print(arr[index] + " ");

    }

//    Level order traversal

    public void levelOrder() {
        for (int i = 1; i <= lastUsedIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }

//    Search Method using levelOrder

    public int search(String value) {
        for (int i = 1; i <= lastUsedIndex; i++) {
            if (value.equals(arr[i])) {
                System.out.println("Value exists  @ location " + i);
                return i;
            }
        }

        System.out.println("The value doesn't exists in the BT.");
        return -1;
    }


//    delete

    public void delete(String value) {
        int location = search(value);
        if (location == -1) {
            return;
        } else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("The Node successfully deleted...");
        }
    }

//    delete bt

    public void deleteBinaryTree() {
        try {
            arr = null;
            System.out.println("The Binary Tree has been successfully Deleted.");
        } catch (Exception e) {
            System.out.println("There is an error deleting the tree.");
        }
    }




    @Override
    public String toString() {
        return "BinaryTreeArr{" +
                "arr=" + Arrays.toString(arr) +
                ", lastUsedIndex=" + lastUsedIndex +
                '}';
    }
}
