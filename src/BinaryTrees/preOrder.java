package BinaryTrees;

import java.util.LinkedList;
import java.util.Stack;

public class preOrder {

    
    String preOrderTree(TreeNode root) {
    	
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
	    while (stk.empty() == false) { 
	          
	        // Pop the top item from stack and print it 
	        TreeNode curr = stk.peek(); 
	        sb.append(curr);
	        stk.pop(); 
	
	        // Push right and left children of the popped node to stack 
	        if (curr.right != null) { 
	            stk.push(curr.right); 
	        } 
	        if (curr.left != null) { 
	            stk.push(curr.left); 
	        } 
	    } 
	    return sb.toString();
    }


    public static void main(String args[]) { 

    	TreeNode root = new TreeNode(0);
    	root.left.data = 10;
    }
    
}
