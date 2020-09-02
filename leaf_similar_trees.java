import java.util.*;

public class leaf_similar_trees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        getLeaves(root1, leaves1);
        getLeaves(root2, leaves2);

        return leaves1.equals(leaves2);
    }

    public void getLeaves(TreeNode root, List<Integer> L) {
        if (root != null) {
            if (root.left == null && root.right == null)
                L.add(root.val);
            getLeaves(root.left, L);
            getLeaves(root.right, L);
        }
    }
}
