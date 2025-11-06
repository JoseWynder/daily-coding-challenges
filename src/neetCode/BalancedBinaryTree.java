package neetCode;

// https://neetcode.io/problems/balanced-binary-tree?list=neetcode150

public class BalancedBinaryTree {
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

    public static boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    public static int checkHeight(TreeNode node) {
        if(node == null) return 0;

        int leftHeight = checkHeight(node.left);
        if(leftHeight == -1) return -1;
        int rightHeight = checkHeight(node.right);
        if(rightHeight == -1) return -1;

        if(Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        System.out.println("true == " + isBalanced(
            new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3,
                    new TreeNode(4),
                    null
                )
            )
        ));
        System.out.println("false == " + isBalanced(
                new TreeNode(1,
                        new TreeNode(2),
                        new TreeNode(3,
                                new TreeNode(4,
                                        new TreeNode(5),
                                        null),
                                null
                        )
                )
        ));
        System.out.println("true == " + isBalanced(
                new TreeNode(3,
                        new TreeNode(9),
                        new TreeNode(20,
                                new TreeNode(15),
                                new TreeNode(7)
                        )
                )
        ));
        System.out.println("true == " + isBalanced(null));
    }
}
