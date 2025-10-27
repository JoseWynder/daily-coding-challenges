package neetCode;

// https://neetcode.io/problems/subtree-of-a-binary-tree?list=neetcode150

public class SubtreeOfAnotherTree {
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

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        StringBuilder rootStr = new StringBuilder();
        StringBuilder subStr = new StringBuilder();
        serialize(root, rootStr);
        serialize(subRoot, subStr);
        return rootStr.toString().contains(subStr);
    }

    public static void serialize(TreeNode node, StringBuilder strB) {
        if(node == null) {
            strB.append("N");
            return;
        }
        strB.append("|").append(node.val);
        serialize(node.left, strB);
        serialize(node.right, strB);
    }

//    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
//        if(subRoot == null) return true;
//        if(root == null) return false;
//        if(ifSameTree(root, subRoot)) return true;
//        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
//    }
//
//    public static boolean ifSameTree(TreeNode root, TreeNode subRoot) {
//        if(root == null && subRoot == null) return true;
//        if(root == null || subRoot == null) return false;
//        if(root.val != subRoot.val) return false;
//        return ifSameTree(root.left, subRoot.left) && ifSameTree(root.right, subRoot.right);
//    }

    public static void main(String[] args) {
        TreeNode root =
            new TreeNode(1,
                    new TreeNode(2,
                            new TreeNode(4),
                            new TreeNode(5)
                    ),
                    new TreeNode(3)
            );

        TreeNode subRoot =
            new TreeNode(2,
                    new TreeNode(4),
                    new TreeNode(5)
            );

        System.out.println("true == " + isSubtree(root, subRoot));

        root =
            new TreeNode(1,
                    new TreeNode(2,
                            new TreeNode(4,
                                    new TreeNode(6),
                                    null
                            ),
                            new TreeNode(5)
                    ),
                    new TreeNode(3)
            );

        System.out.println("false == " + isSubtree(root, subRoot));


        root = new TreeNode(1, new TreeNode(1), null);
        subRoot = new TreeNode(1);
        System.out.println("true == " + isSubtree(root, subRoot));


        root = new TreeNode(12,  null, new TreeNode(13));
        subRoot = new TreeNode(3);
        System.out.println("false == " + isSubtree(root, subRoot));
    }
}
