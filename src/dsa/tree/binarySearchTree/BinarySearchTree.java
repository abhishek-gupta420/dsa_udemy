package dsa.tree.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BinaryNode root;

    BinarySearchTree() {
        root = null;
    }


    // Insert method

//    helper method for insert
private BinaryNode insert(BinaryNode currentNode, int value) {
    if (currentNode == null) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
         System.out.println("The value successfully inserted");
        return newNode;
    } else if (value <= currentNode.value) {
        currentNode.left = insert(currentNode.left, value);
        return currentNode;
    } else {
        currentNode.right = insert(currentNode.right, value);
        return currentNode;
    }
}

    void insert(int value) {
        root = insert(root, value);
    }

//    preorder taversal

    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }


//    Innorder traversal

    public void inOrder(BinaryNode node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);

    }

//    post order traversal

    public void postOrder(BinaryNode node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

//    level order traversal
    void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }

            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }


//    search method

    BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            System.out.println("Value : " + value + " not found in BST.");
            return null;
        } else if (node.value == value) {
            System.out.println("Value : " + value + "  found in BST.");
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

//    delete node from bst

//     minimum node -> to find successer of the node to be deleted.

//    public static BinaryNode minimumNode(BinaryNode root) {
//        if (root.left == null) return null;
//        else {
//            return minimumNode(root.left);
//        }
//    }
//
////    delete node
//
//    public BinaryNode deleteNode(BinaryNode root, int value) {
//        if (root == null) {
//            System.out.println("Value not found in BST.");
//            return null;
//        }
//
//        if (value < root.value) {
//            root.left = deleteNode(root.left, value);
//        } else if (value > root.value) {
//            root.right = deleteNode(root.right, value);
//        } else {
////            implement 3 cases in else condition.
//
////             case 1 when node has 2 children
//            if (null != root.left && null != root.right) {
//                BinaryNode temp = root;
//                BinaryNode minNodeForRight = minimumNode(temp.right);
//                root.value = minNodeForRight.value;
//                root.right = deleteNode(root.right, minNodeForRight.value);
//            } else if (root.left != null) { // when node has only one child (left)
//                root = root.left;
//            } else if (root.right != null) { //when node has only one chld (right);
//                root = root.right;
//            } else {
////               case 3  .when node is leaf node...
//                root = null;
//            }
//        }
//
//        return root;
//    }

    public static BinaryNode minimumNode(BinaryNode root) {
        if (root.left == null) {
            return root;
        } else {
            return minimumNode(root.left);
        }
    }

    // Delete node
    public BinaryNode deleteNode(BinaryNode root, int value) {
        if (root == null) {
            System.out.println("Value not found in BST");
            return null;
        }
        if (value < root.value) {
            root.left = deleteNode(root.left, value);
        } else if (value > root.value) {
            root.right = deleteNode(root.right, value);
        } else {
            if (root.left != null && root.right != null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minimumNode(temp.right);
                root.value = minNodeForRight.value;
                root.right = deleteNode(root.right, minNodeForRight.value);
            } else if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }

        return root;

    }


//    delete BST

    void deleteBST() {
        root = null;
        System.out.println("BST deleted successfully..");
    }


    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
