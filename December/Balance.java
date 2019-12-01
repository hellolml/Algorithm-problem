package December;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class Balance {
    public boolean isBalance(TreeNode root) {
        if(root==null) return true;
        if(Math.abs(deep(root.right)-deep(root.left))>1)return false;
        return isBalance(root.left)&&isBalance(root.right);
    }
    public int deep(TreeNode root){
        if(root ==null)return 0;
        return Math.max(deep(root.left),deep(root.right))+1;
    }
}