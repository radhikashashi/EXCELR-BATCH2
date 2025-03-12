/** Merge Two Binary Trees */ 

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
 
class LTCODE039 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode merge = new TreeNode();
        if(root1 == null) return root2;
        if(root2 == null) return root1;
        merge.val = root1.val + root2.val;
        merge.left = mergeTrees(root1.left,root2.left);
        merge.right = mergeTrees(root2.right,root1.right);
        return merge;
    }
}