package Exercises;

public class BinaryTree {
    private TreeNode root;

    public static void main(String[] args) {
        var binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        binaryTree.preOrder(binaryTree.root);
    }

    public BinaryTree () {}
    public BinaryTree (int data) {
        this.root = new TreeNode(data);
    }

    private class TreeNode {
        private final int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(4);
        TreeNode fourth = new TreeNode(3);
        // TreeNode fifth = new TreeNode(5);

        this.root = first;
        first.left = second;
        first.right = fourth;

        second.left = third;
        //second.right = fifth;
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
