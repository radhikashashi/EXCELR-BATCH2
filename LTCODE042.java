/**Binary Tree Pruning */

 class TreeNode {
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
 
class LTCODE042 {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) return null; 
        root.left = pruneTree(root.left); 
        root.right = pruneTree(root.right);
        if (root.val == 0 && root.left == null && root.right == null) {
            return null;
        }
        return root; 
    }
}
