public class deepest_leaves_sum {
    public int deepestLeavesSum(TreeNode root) {
        int maxDepth = maxTreeDepth(root);
        int sumDeepestLeaves = sumDeepLeaves(root, maxDepth, 1);
        return sumDeepestLeaves;
    }

    private int sumDeepLeaves(TreeNode root, int maxDepth, int initialDepth) {
        int sum = 0;
        if (root.left != null)
            sum += sumDeepLeaves(root.left, maxDepth, initialDepth+1);
        if (root.right != null)
            sum += sumDeepLeaves(root.right, maxDepth, initialDepth+1);
        
        if (initialDepth == maxDepth)
            sum += root.val;
        return sum;
    }

    private int maxTreeDepth(TreeNode root) {
        if (root == null)
            return 0;

        int lDepth = maxTreeDepth(root.left);
        int rDepth = maxTreeDepth(root.right);

        return Math.max(lDepth, rDepth) + 1;
    }
}
