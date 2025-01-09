package dsa.tree.binaryTreeUsingArray;

public class MainBinaryTreeArr {
    public static void main(String[] args) {
        BinaryTreeArr binaryTreeArr = new BinaryTreeArr(9);
        binaryTreeArr.insert("N1");
        binaryTreeArr.insert("N2");

        binaryTreeArr.insert("N3");

        binaryTreeArr.insert("N4");
        binaryTreeArr.insert("N5");
        binaryTreeArr.insert("N6");
        binaryTreeArr.insert("N7");
        binaryTreeArr.insert("N8");
        binaryTreeArr.insert("N9");


        System.out.println(binaryTreeArr);
        System.out.println();
        binaryTreeArr.preOrder(1);
        System.out.println(
        );

        binaryTreeArr.inOrder(1);

        System.out.println();

        binaryTreeArr.postOrder(1);

        System.out.println();

        binaryTreeArr.levelOrder();

        System.out.println();
        binaryTreeArr.search("m5");
        System.out.println();

        binaryTreeArr.delete("N5");

        System.out.println();

        binaryTreeArr.levelOrder();

        System.out.println();
        binaryTreeArr.deleteBinaryTree();

        System.out.println(binaryTreeArr);

    }
}
