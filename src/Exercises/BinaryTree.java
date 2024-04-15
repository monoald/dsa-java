package Exercises;

import com.sun.source.tree.Tree;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private TreeNode root;

    public static void main(String[] args) {
        var binaryTree = new BinaryTree();
        binaryTree.createBinaryTree();
        System.out.print("Max: " + binaryTree.max(binaryTree.root));
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

    public void recursiveInOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            recursiveInOrder(root.left);
        }

        System.out.print(root.data + " - ");

        if (root.right != null) {
            recursiveInOrder(root.right);
        }
    }

    public void iterativeInOrder() {
        if (this.root == null) {
            return;
        }

        var temp = this.root;
        var stack = new Stack<TreeNode>();
        while(!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data +  " - ");
                temp = temp.right;
            }
        }
    }

    public void recursivePostOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        recursivePostOrder(root.left);
        recursivePostOrder(root.right);

        System.out.print(root.data + " - ");
    }

    public void iterativePostOrder() {
        var current = this.root;
        var stack = new Stack<TreeNode>();

        while (!stack.empty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                var temp = stack.peek().right;

                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " - ");

                    while(!stack.empty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " - ");
                    }
                } else {
                    current = temp;
                }
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

    public int max(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        var result = root.data;
        var left = max(root.left);
        var right = max(root.right);

        if (left > result) result = left;
        if (right > result) result = right;

        return result;
    }
}
