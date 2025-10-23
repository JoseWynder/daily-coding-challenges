package leetCode;

// https://leetcode.com/problems/binary-tree-preorder-traversal/

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            result.add(current.val);

            if (current.right != null)  {
                stack.push(current.right);
            }

            if (current.left  != null)  {
                stack.push(current.left);
            }
        }

        return result;
    }

//    public static List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        preorderTraversalRecursive(root, result);
//        return result;
//    }
//
//    private static void preorderTraversalRecursive(TreeNode node, List<Integer> result) {
//        if (node == null) return;
//        result.add(node.val);
//        preorderTraversalRecursive(node.left, result);
//        preorderTraversalRecursive(node.right, result);
//    }

    public static void main(String[] args) {
        System.out.println("[] == " + preorderTraversal(null));
        System.out.println("[1] == " + preorderTraversal(new TreeNode(1)));

        System.out.println("[1, 2, 3] == " + preorderTraversal(
            new TreeNode(1,
                null,
                new TreeNode(2,
                    new TreeNode(3),
                    null
                )
            )
        ));

        System.out.println("[1, 2, 4, 5, 6, 7, 3, 8, 9] == " + preorderTraversal(
            new TreeNode(1,
                new TreeNode(2,
                    new TreeNode(4),
                    new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(7)
                    )
                ),
                new TreeNode(3,
                    null,
                    new TreeNode(8,
                        new TreeNode(9),
                        null
                    )
                )
            )
        ));

    }
}
