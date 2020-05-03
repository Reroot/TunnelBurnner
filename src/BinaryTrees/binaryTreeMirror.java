package BinaryTrees;

import java.util.*;

public class binaryTreeMirror {
	static void mirrorBFS(TreeNode root) { 
	    if (root == null) 
	        return; 
	    Queue<TreeNode> q = new LinkedList<TreeNode>(); 
	    q.add(root); 
	    // Do BFS. While doing BFS, keep swapping 
	    // left and right children 
	    while (q.size() > 0) { 
	        // pop top node from queue 
	    	TreeNode curr = q.peek(); 
	        q.remove(); 
	        // swap left child with right child 
	        TreeNode temp = curr.left; 
	        curr.left = curr.right; 
	        curr.right = temp;
	        // push left and right children 
	        if (curr.left != null) 
	            q.add(curr.left); 
	        if (curr.right != null) 
	            q.add(curr.right); 
	    } 
	} 
	static void inOrder(TreeNode node) { 
	    if (node == null) 
	        return; 
	    inOrder(node.left); 
	    System.out.print( node.val + " "); 
	    inOrder(node.right); 
	} 

	/* Driver code */
	public static void main(String args[]) 
	{ 
		TreeNode root = new TreeNode(1); 
	    root.left = new TreeNode(2); 
	    root.right = new TreeNode(3); 
	    root.left.left = new TreeNode(4); 
	    root.left.right = new TreeNode(5); 
	    /* Print inorder traversal of the input tree */
	    System.out.print( "\n Inorder traversal of the"
	            +" coned tree is \n"); 
	    inOrder(root); 
	  
	    /* Convert tree to its mirror */
	    mirrorBFS(root); 
	  
	    /* Print inorder traversal of the mirror tree */
	    System.out.print( "\n Inorder traversal of the "+ 
	        "mirror tree is \n"); 
	    inOrder(root); 
	}

}
