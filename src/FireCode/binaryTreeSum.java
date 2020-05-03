package FireCode;

import java.util.Stack;

public class binaryTreeSum {
	public int sumItr(TreeNode root) { 
	    //inorder
	    TreeNode curr = root;
	    Stack<TreeNode> stk = new Stack<TreeNode>();
	    int sum = 0;
	    
	    while(curr != null || !stk.isEmpty()) {
	        while(curr != null) {
	            stk.push(curr);
	            curr = curr.left;
	        }
	        
	        curr = stk.pop();
	        sum += curr.data;
	        
	        curr = curr.right;
	    }
	    return sum;
	}
}
