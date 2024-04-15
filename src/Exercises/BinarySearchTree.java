package Exercises;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree {
    private TreeNode root;

    public static void main(String[] args) {
        var binarySearchTree = new BinarySearchTree();
        binarySearchTree.root = BinarySearchTree.recursiveInsert(binarySearchTree.root, 5);
        binarySearchTree.root = BinarySearchTree.recursiveInsert(binarySearchTree.root, 3);
        binarySearchTree.root = BinarySearchTree.recursiveInsert(binarySearchTree.root, 1);
        binarySearchTree.root = BinarySearchTree.recursiveInsert(binarySearchTree.root, 7);

        binarySearchTree.inOrder();
    }

    public BinarySearchTree() {}

    private static class TreeNode {
        private final int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static TreeNode recursiveInsert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.data) {
            root.left = recursiveInsert(root.left, value);
        }

        if (value > root.data) {
            root.right = recursiveInsert(root.right, value);
        }

        return root;
    }

    public void inOrder() {
        var stack = new Stack<TreeNode>();
        var temp = this.root;

        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " - ");
                temp = temp.right;
            }
        }
    }
    public void levelOrder() {
        if (this.root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(this.root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();

            System.out.print(currentNode.data + " - ");
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }
    }
}
