package FireCode;

import java.util.Stack;

public class binaryTreeFindSize {

	public int size(TreeNode root) {
		//preoderer, count with a stack
		if(root == null) return 0;
		Stack<TreeNode> stk = new Stack<TreeNode>();
		TreeNode curr = root;
		stk.push(curr);
		int count = 0;
		while(!stk.isEmpty()) {
			count++;//can act as +1even if count0
			curr = stk.pop();
			if(curr.left != null) {
				stk.push(curr.left);
			}
			if(curr.right != null) {
				stk.push(curr.right);
			}
		}
		return count;
	}
}
//Given a binary tree, write a method to return its size. The size of a tree is the number of nodes it contains.
//Examples: 
//     1                
//    / \             
//   2   3     ==>  7
//  / \ / \           
// 4  5 6  7 