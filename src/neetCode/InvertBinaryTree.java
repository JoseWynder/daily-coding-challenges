package neetCode;

// https://neetcode.io/problems/invert-a-binary-tree?list=neetcode150

public class InvertBinaryTree {

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

    public static void printTreeNode(TreeNode root, boolean isRoot) {
        if(root == null) return;
        if(isRoot) System.out.print(root.val);

        if(root.left != null) {
            System.out.print(", " + root.left.val);
        }

        if(root.right != null) {
            System.out.print(", " + root.right.val);
        }

        printTreeNode(root.left, false);
        printTreeNode(root.right, false);
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        TreeNode right = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(right);
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3, new TreeNode(6), new TreeNode(7)));

        treeNode = invertTree(treeNode);
        System.out.print("1, 3, 2, 7, 6, 5, 4 == ");
        printTreeNode(treeNode, true);
    }
}
