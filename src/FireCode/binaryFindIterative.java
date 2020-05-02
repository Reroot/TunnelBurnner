package FireCode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class binaryFindIterative {//ie level order
	public static boolean findNode(TreeNode root, int val) {
	    
	    //iteration with trees requres a stack for order traversals, and que for level order
	    //thus there's two ways to do this.
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    
	    while(root != null) {//or if
	    	q.add(root);
	    	while(!q.isEmpty()) {//good
	    		TreeNode n = q.poll();
	            if(n.data == val) {//good
	                return true;
	            } 
	            if(n.left != null) {
	                q.add(n.left);
	            }
	            
	            if(n.right != null) {
	                q.add(n.right);
	            }
	        }
	        //if we broke the que loop
	    	//then we have not found the answer
	    	return false;
	    }
	    //root is null, return false; 
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}	
//		Given a binary tree, write a method to find and return the node with data = the input data. Do not use recursion.
//
//				Example:  
//				       1              
//				      / \            
//				     2   3    
//				    / \ / \          
//				   4  5 6  7         
//
//				findNode(root, 5) ==> 5
//
//				Note: Return null, if desired node is not found.


