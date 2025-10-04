package neetCode;

// https://neetcode.io/problems/same-binary-tree?list=neetcode150

public class SameBinaryTree {

    // Definition for a binary tree node.
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

    public static void main(String[] args) {

        System.out.println("true == " + SameBinaryTree.isSameTree(
                new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                new TreeNode(1, new TreeNode(2), new TreeNode(3))));

        System.out.println("false == " + SameBinaryTree.isSameTree(
                new TreeNode(1, new TreeNode(2), new TreeNode(3)),
                new TreeNode(1, new TreeNode(3), new TreeNode(2))));

        System.out.println("false == " + SameBinaryTree.isSameTree(
                new TreeNode(4, new TreeNode(7), null),
                new TreeNode(4, null, new TreeNode(7))));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return p == null && q == null;
        }
    }
}
