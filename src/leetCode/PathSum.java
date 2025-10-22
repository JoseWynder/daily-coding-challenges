package leetCode;

// https://leetcode.com/problems/path-sum/

public class PathSum {
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

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        int remaining = targetSum - root.val;
        if(root.left == null && root.right == null) {
            return remaining == 0;
        }
        return hasPathSum(root.left, remaining) ||hasPathSum(root.right, remaining);
    }

    public static void main(String[] args) {
        TreeNode treeNode =
            new TreeNode(5,
                new TreeNode(4,
                    new TreeNode(11,
                        new TreeNode(7),
                        new TreeNode(2)),
                    null
                ),
                new TreeNode(8,
                    new TreeNode(13),
                    new TreeNode(4,
                        null,
                        new TreeNode(1)
                    )
                )
            );

        System.out.println("true == " + hasPathSum(treeNode, 22));

        treeNode =
                new TreeNode(1,
                    new TreeNode(2),
                    new TreeNode(3)
                );

        System.out.println("false == " + hasPathSum(treeNode, 5));
        System.out.println("false == " + hasPathSum(null, 0));
    }
}
