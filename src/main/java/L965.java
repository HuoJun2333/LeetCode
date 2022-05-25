/**
 * @author 学徒
 * @create 2022-05-24
 * @description
 */
public class L965 {

      public class TreeNode {
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

    int val = -1;
    public boolean isUnivalTree(TreeNode root) {
        if (val == -1) {
            val = root.val;
        }
        if (root == null) {
            return true;
        }
        if (root.val != val) {
            return false;
        }
        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
