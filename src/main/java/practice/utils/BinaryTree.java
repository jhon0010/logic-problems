package practice.utils;

public class BinaryTree {

    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    /**
     * Create an binary search tree
     * @return BinaryTree
     */
    public static BinaryTree createBst() {
        BinaryTree root = new BinaryTree(10);

        root.left = new BinaryTree(5);
        root.left.left = new BinaryTree(2);
        root.left.left.left = new BinaryTree(1);
        root.left.right = new BinaryTree(25);

        root.right = new BinaryTree(15);
        root.right.right = new BinaryTree(22);
        root.right.left = new BinaryTree(13);
        root.right.left.right = new BinaryTree(14);
        return root;
    }

}
