package Exercises;

import com.sun.source.tree.Tree;

import java.util.EmptyStackException;
import java.util.Stack;

public class BinaryTree {
    private TreeNode root;

    public static void main(String[] args) {
        var binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        binaryTree.iterativePreOrder();
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
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        this.root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

        third.left = sixth;
        third.right = seventh;
    }

    public void recursivePreOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        recursivePreOrder(root.left);
        recursivePreOrder(root.right);
    }

    public void iterativePreOrder() {
        if (root == null) {
            return;
        }

        var stack = new Stack<TreeNode>();
        stack.push(this.root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " - ");

            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }
}
