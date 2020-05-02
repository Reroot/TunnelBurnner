package FireCode;

import java.util.*;

public class binaryTreeMirror {
	static void mirror(Node root) { 
	    if (root == null) 
	        return; 
	    Queue<Node> q = new LinkedList<Node>(); 
	    q.add(root); 
	    // Do BFS. While doing BFS, keep swapping 
	    // left and right children 
	    while (q.size() > 0) { 
	        // pop top node from queue 
	        Node curr = q.peek(); 
	        q.remove(); 
	        // swap left child with right child 
	        Node temp = curr.left; 
	        curr.left = curr.right; 
	        curr.right = temp;
	        // push left and right children 
	        if (curr.left != null) 
	            q.add(curr.left); 
	        if (curr.right != null) 
	            q.add(curr.right); 
	    } 
	} 
	static void inOrder( Node node) { 
	    if (node == null) 
	        return; 
	    inOrder(node.left); 
	    System.out.print( node.data + " "); 
	    inOrder(node.right); 
	} 
	static Node newNode(int data) { 
	    Node node = new Node(data); 
	    node.data = data; 
	    node.left = node.right = null; 
	    return(node); 
	} 
	  
	/* Driver code */
	public static void main(String args[]) 
	{ 
	    Node root = newNode(1); 
	    root.left = newNode(2); 
	    root.right = newNode(3); 
	    root.left.left = newNode(4); 
	    root.left.right = newNode(5); 
	    /* Print inorder traversal of the input tree */
	    System.out.print( "\n Inorder traversal of the"
	            +" coned tree is \n"); 
	    inOrder(root); 
	  
	    /* Convert tree to its mirror */
	    mirror(root); 
	  
	    /* Print inorder traversal of the mirror tree */
	    System.out.print( "\n Inorder traversal of the "+ 
	        "mirror tree is \n"); 
	    inOrder(root); 
	}
}
