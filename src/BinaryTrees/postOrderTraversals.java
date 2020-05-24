package BinaryTrees;

import java.util.Stack;

public class postOrderTraversals {
	static //go all the way down before printing the stack
	//print at the left most, so all the way down first, then right then right, then left most then on null go back up root
    String postOrder(TreeNode root) {
    	// Base Case 
	    if (root == null) { 
	        return ""; 
	    } 
    	// Create an empty stack and push root to it 
	    Stack<TreeNode> stk = new Stack<TreeNode>(); 
	    stk.push(root); 
	    StringBuilder sb = new StringBuilder();
	    /* Pop all items one by one. Do following for every popped item 
	     a) print it 
	     b) push its right child 
	     c) push its left child 
	     Note that right child is pushed first so that left is processed first */
	    String nullMarker = "null";
	    while (stk.empty() == false) { 
	    	//post order will stack right, left, ...node
	    	//post order will start unstacking at leftmost
	        // Pop the top item from stack and print it 
	        TreeNode curr = stk.pop(); 
	        if(curr == null) {
	        	sb.append(nullMarker).append(",");
	        } else {
	        	sb.append(curr).append(",");
	        }
	        // Push right and left children of the popped node to stack 
	        if (curr.right != null) { 
	            stk.push(curr.right); 
	        } 
	        if (curr.left != null) { 
	            stk.push(curr.left); 
	        } 
	    } 
	    return String.valueOf(sb.toString());
    }
    
	public static void main(String[] args) {

		TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2); 
        tree.right = new TreeNode(2); 
        tree.left.left = new TreeNode(6); 
        tree.left.right = new TreeNode(4); 
        tree.right.left = new TreeNode(4); 
        tree.right.right = new TreeNode(3);
        System.out.println(postOrder(tree));
    }
}
