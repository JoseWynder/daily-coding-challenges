package leetCode;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/

public class MaximumDepthOfBinaryTree {
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

    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode =
            new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                    new TreeNode(15),
                    new TreeNode(7)
                )
            );

        System.out.println("3 == " + maxDepth(treeNode));
        System.out.println("2 == "
                + maxDepth(new TreeNode(1, null, new TreeNode(2))));
    }
}
