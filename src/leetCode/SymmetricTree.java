package leetCode;

// https://leetcode.com/problems/symmetric-tree/description/

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
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

    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }

    public static boolean isMirror(TreeNode leftSubtree, TreeNode rightSubtree) {
        if(leftSubtree == null && rightSubtree == null) return true;
        if(leftSubtree == null || rightSubtree == null) return false;
        if(leftSubtree.val != rightSubtree.val) return false;
        return
                isMirror(leftSubtree.left, rightSubtree.right) &&
                isMirror(leftSubtree.right, rightSubtree.left);
    }

//    public static boolean isSymmetric(TreeNode root) {
//        if(root == null) return true;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root.left);
//        queue.add(root.right);
//
//        while (!queue.isEmpty()) {
//            TreeNode leftSubtree = queue.poll();
//            TreeNode rightSubtree = queue.poll();
//
//            if(leftSubtree == null && rightSubtree == null) continue;
//            if(leftSubtree == null || rightSubtree == null) return false;
//            if(leftSubtree.val != rightSubtree.val) return false;
//
//            queue.add(leftSubtree.left);
//            queue.add(rightSubtree.right);
//            queue.add(leftSubtree.right);
//            queue.add(rightSubtree.left);
//        }
//
//        return true;
//    }

    public static void main(String[] args) {

        TreeNode treeNode =
            new TreeNode(1,
                new TreeNode(2,
                    new TreeNode(3),
                    new TreeNode(4)
                ),
                new TreeNode(2,
                    new TreeNode(4),
                    new TreeNode(3)
                )
            );

        System.out.println("true == " + isSymmetric(treeNode));

        treeNode =
            new TreeNode(1,
                new TreeNode(2,
                        null,
                    new TreeNode(3)
                ),
                new TreeNode(2,
                    null,
                    new TreeNode(3)
                )
            );

        System.out.println("false == " + isSymmetric(treeNode));
    }
}
