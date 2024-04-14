package Exercises;

public class BinaryTree {
    private TreeNode root;

    public static void main(String[] args) {}

    public BinaryTree () {}
    public BinaryTree (int data) {
        this.root = new TreeNode(data);
    }

    private class TreeNode {
        private final int data;
        private TreeNode left;
        private TreeNode rigth;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        this.root = first;
        first.left = second;
        first.rigth = third;

        second.left = fourth;
        second.rigth = fifth;
    }
}
