/**
 * @author 学徒
 * @create 2022-05-30
 * @description
 */
public class L1022 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    int dfs(TreeNode root, int cur) {
        int ans = 0, ncur = (cur << 1) + root.val;
        if (root.left != null) {
            ans += dfs(root.left, ncur);
        }
        if (root.right != null) {
            ans += dfs(root.right, ncur);
        }
        return root.left == null && root.right == null ? ncur : ans;
    }
}
