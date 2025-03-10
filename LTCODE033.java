import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class LTCODE033 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        return prehelper(root, list); 
    }

    private List<Integer> prehelper(TreeNode root, List<Integer> list) {
        if (root == null) return list; 

        list.add(root.val); 
        prehelper(root.left, list);  
        prehelper(root.right, list); 

        return list;
    }
}
