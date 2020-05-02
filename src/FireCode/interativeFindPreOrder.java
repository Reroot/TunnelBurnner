package FireCode;

import java.util.Stack;

public class interativeFindPreOrder {
	//first try pass!!! preorder root,left,right--post left,right,root, in - left, root, right
	public TreeNode findNode(TreeNode root, int val) {
	    //use iteative preorder
	    Stack<TreeNode> stk = new Stack<TreeNode>();
	    if(root == null) return null;
	    //dont directly traverse the root
	    TreeNode curr = root;
	    stk.push(curr);
	    while(!stk.isEmpty()) {
	        curr = stk.peek();
	        stk.pop();
	        if(curr.data == val) {
	            return curr;
	        }
	        if(curr.left != null) {
	            stk.push(curr.left);
	        }
	        if(curr.right != null) {
	            stk.push(curr.right);
	        }
	    }
	    return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
