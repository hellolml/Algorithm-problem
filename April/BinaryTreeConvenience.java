package April;

import java.util.Stack;

class TreeNode{
    String value;
    TreeNode left;
    TreeNode right;
    public TreeNode(String value){
        this.value = value;
    }
    public TreeNode(String value,TreeNode left,TreeNode right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
public class BinaryTreeConvenience {
    public static void preOderIteration(TreeNode head){
        if(head==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.print(node.value+" ");
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
    }
    public static void inOderIteration(TreeNode head){
        if(head==null){
            return;
        }
        TreeNode cur = head;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty()||cur!=null){
            while (cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            System.out.print(node.value+" ");
            if(node.right!=null){
                cur = node.right;
            }
        }
    }
    public static void postOderIteration(TreeNode head){
        if(head==null){
            return;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(head);
        while (!stack1.isEmpty()){
            TreeNode node = stack1.pop();
            stack2.push(node);
            if(node.left!=null){
                stack1.push(node.left);
            }
            if(node.right!=null){
                stack1.push(node.right);
            }
        }
        while (!stack2.isEmpty()){
            System.out.print(stack2.pop().value+" ");
        }
    }
    public static TreeNode createBT(){
        TreeNode i = new TreeNode("I");
        TreeNode h = new TreeNode("H");
        TreeNode g = new TreeNode("G");
        TreeNode e = new TreeNode("E");
        TreeNode f = new TreeNode("F", h, i);
        TreeNode d = new TreeNode("D", null, g);
        TreeNode c = new TreeNode("C", f, null);
        TreeNode b = new TreeNode("B", d, e);
        TreeNode root = new TreeNode("A", b, c);
        return root;
    }
    public static void main(String args[]){
            TreeNode root = createBT();
            preOderIteration(root);
            System.out.println();
            inOderIteration(root);
            System.out.println();
            postOderIteration(root);
    }
}
