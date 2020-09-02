public class invert_binary_tree {
    public TreeNode invertTree(TreeNode root) {
        if (isLeaf(root))
            return root;
        invertTree(root.left);
        invertTree(root.right);
        swapLeaves(root);
        return root;
    }

    private boolean isLeaf(TreeNode n) {
        return (n == null) || (n.left == null && n.right == null);
    }
    
    public void swapLeaves(TreeNode n) {
        TreeNode tmp = n.left;
        n.left = n.right;
        n.right = tmp;
    }
}
