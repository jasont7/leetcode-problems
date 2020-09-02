public class sum_nodes_even_grandparent {
    public int sumEvenGrandparent(TreeNode root) {
        return recursiveSum(root, false);
    }

    private int recursiveSum(TreeNode root, boolean parentIsEven) {
        if (root == null)
            return 0;

        int sum = 0;
        if (parentIsEven) {
            if (root.left != null)
                sum += root.left.val;
            if (root.right != null)
                sum += root.right.val;
        }
        sum += recursiveSum(root.left, root.val % 2 == 0);
        sum += recursiveSum(root.right, root.val % 2 == 0);

        return sum;
    }
}
