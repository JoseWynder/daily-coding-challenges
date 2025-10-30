package neetCode;

// https://neetcode.io/problems/binary-tree-diameter?list=neetcode150

public class DiameterOfBinaryTree {
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

    public static int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        calculateDiameter(root, diameter);
        return diameter[0];
    }

    private static int calculateDiameter(TreeNode node, int[] diameter) {
        if (node == null) return 0;
        int leftHeight = calculateDiameter(node.left, diameter);
        int rightHeight = calculateDiameter(node.right, diameter);
        diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        TreeNode treeNode =
            new TreeNode(1,
                    null,
                    new TreeNode(2,
                            new TreeNode(3,
                                    new TreeNode(5),
                                    null),
                            new TreeNode(4)
                    )
            );

        System.out.println("3 == " + diameterOfBinaryTree(treeNode));

        treeNode =
            new TreeNode(1,
                    new TreeNode(2,
                            new TreeNode(4),
                            new TreeNode(5)
                    ),
                    new TreeNode(3)
            );

        System.out.println("3 == " + diameterOfBinaryTree(treeNode));

        System.out.println("2 == " + diameterOfBinaryTree(
                new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    }
}
