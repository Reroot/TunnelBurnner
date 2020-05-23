package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class InOrderTraversals {
	public ArrayList<Integer> inOrderTraversalIterative(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		Stack<TreeNode> stk = new Stack<TreeNode>();
		//go allthe way down first b4 print, while interative, so we use the stack to go down and get our left then rights
		//we save left and right values in new nodes.
		TreeNode current = root;
		if(current == null) return (ArrayList<Integer>) res;
			//only when currentnode is null and the stack is empty we are done with the iteration
		while(!stk.isEmpty() || current != null) {
			while(current != null) {
				stk.add(current);
				current = current.left;
			} 
				current = stk.pop();//when it's null we pop, first will be on the left
				res.add(current.val);
				current = current.right;
		}
		return (ArrayList<Integer>) res;
	}
}