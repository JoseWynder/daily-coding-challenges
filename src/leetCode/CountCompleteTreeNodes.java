package leetCode;

// https://leetcode.com/problems/count-complete-tree-nodes/description/

public class CountCompleteTreeNodes {
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

//    public static int countNodes(TreeNode root) {
//        return countNodes(root,new int[]{0});
//    }
//
//    public static int countNodes(TreeNode root, int[] count) {
//        if(root == null) return count[0];
//        count[0]++;
//        countNodes(root.left, count);
//        return countNodes(root.right, count);
//    }

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (leftHeight == rightHeight) {
            return (1 << leftHeight) + countNodes(root.right);
        } else {
            return (1 << rightHeight) + countNodes(root.left);
        }
    }

    private static int getHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }

    public static void main(String[] args) {
        TreeNode treeNode =
                new TreeNode(1,
                        new TreeNode(2,
                                new TreeNode(4),
                                new TreeNode(5)
                        ),
                        new TreeNode(3,
                                new TreeNode(6),
                                null
                        )
                );

        System.out.println("6 == " + countNodes(treeNode));
        System.out.println("0 == " + countNodes(null));
        System.out.println("1 == " + countNodes(new TreeNode(1)));
    }
}
