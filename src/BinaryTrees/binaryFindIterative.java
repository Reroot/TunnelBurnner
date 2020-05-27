package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class binaryFindIterative {//ie level order
	public static boolean findNode(TreeNode root, int val) {
	    //IF IT"S NOT A BST, OTHERWISE WE CAN CONTROL IF WE NEED TO GO LEFT OR RIGHT!!!!*****
	    //iteration with trees requres a stack for order traversals, and que for level order
	    //thus there's two ways to do this.
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    
	    while(root != null) {//or if
	    	q.add(root);
	    	while(!q.isEmpty()) {//good
	    		TreeNode n = q.poll();
	            if(n.val == val) {//good
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
		   TreeNode tree = new TreeNode(1);
	       tree.left = new TreeNode(2); 
	       tree.right = new TreeNode(2); 
	       tree.left.left = new TreeNode(6); 
	       tree.left.right = new TreeNode(4); 
	       tree.right.left = new TreeNode(4); //for seriralize binary tree
	       tree.right.right = new TreeNode(3);//the oppiste of a postorder print gives us an ablity to build via preprder-IE prePLR, postLRP
	       //System.out.println(postOrder(tree));//prints 1,2,6,4,2,4,3 -- So if we 
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


