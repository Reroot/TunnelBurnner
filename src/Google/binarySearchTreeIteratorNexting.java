package Google;

import java.util.Stack;
//https://leetcode.com/problems/binary-search-tree-iterator/
public class binarySearchTreeIteratorNexting {
	//TRY 1
	class BSTIterator {
		TreeNode curr = null;
		Stack<TreeNode> stk = new Stack<TreeNode>();
	    public BSTIterator(TreeNode root) {
	        //preorder beucase we need to print right away but go down the leftmost path first
	        //every next, iter once of a preorder, preorder is root, left, right,all around the tree till leftmost
	        TreeNode curr = root;
	        stk.push(curr);
	    }
	    
	    /** @return the next smallest number */
	    public int next() {//lets not run this without hasnext being true first
	        if(hasNext()) {
	            if(curr.left != null) {//iter till not possible anymore
	                curr = curr.left;
	                stk.push(curr);
	                return curr.left.val;//print root right away after pushing hence preorder., then it will be the root, then right
	            } 
	            curr = stk.pop();//pop the stk full of lefts, and look for the first right
	            while(curr != null) {//the rights are the issue because we need to pop off the tree to contuine 
		            if(curr.right != null) {
		                curr = curr.right;
		                stk.push(curr);
		                return curr.right.val;
		            } else {
		            	stk.pop();
		            }
	            }
	        }
			return 0;
	    }
	    
	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        if(curr.left != null || curr.right != null) {
	            return true;
	        }
	        return false; 
	    }
	}
}
