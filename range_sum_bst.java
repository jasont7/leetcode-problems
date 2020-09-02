public class range_sum_bst {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null)
            return 0;

        int sum;
        if (root.val < L || root.val > R)
            sum = 0;
        else
            sum = root.val;
        sum += rangeSumBST(root.left, L, R);
        sum += rangeSumBST(root.right, L, R);
        return sum;
    }
}
