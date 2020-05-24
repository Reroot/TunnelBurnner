package BinaryTrees;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class postOrderTraversals {
	 //go all the way down before printing the stack
	//print at the left most, so all the way down first, then right then right, then left most then on null go back up root
    static String postOrder(TreeNode root) {
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
	    String nullMarker = "X";
	    while (stk.empty() == false) { 
	    	//post order will stack right, left, ...node
	    	//post order will start unstacking at leftmost
	        // Pop the top item from stack and print it 
	        TreeNode curr = stk.pop(); 
	        if(curr == null) {
	        	sb.append("X").append(",");
	        } else {
	        	sb.append(curr.data).append(",");
	        }
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
    public static TreeNode deserializePostOrderPrint(String sb) {// form post orderprint 1,2,6,4,2,4,3 
 	   final String spliter = ",";
       Deque<String> nodes = new LinkedList<>();
       nodes.addAll(Arrays.asList(sb.split(",")));
       return buildTree(nodes);
    }
    
 	private static TreeNode buildTree(Deque<String> nodes) {
 	//TreeNode curr = new TreeNode(Integer.valueOf(nodes.poll()));
      String val = nodes.remove();
      if (val.equals("X")) return null;
      else {
          TreeNode node = new TreeNode(Integer.valueOf(val));
          node.left = buildTree(nodes);
          node.right = buildTree(nodes);
          return node;
      }
 	}

	public static void main(String[] args) {
		
		TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2); 
        tree.right = new TreeNode(2); 
        tree.left.left = new TreeNode(6); 
        tree.left.right = new TreeNode(4); 
        tree.right.left = new TreeNode(4); //for seriralize binary tree
        tree.right.right = new TreeNode(3);//the oppiste of a postorder print gives us an ablity to build via preprder-IE prePLR, postLRP
        System.out.println(postOrder(tree));//prints 1,2,6,4,2,4,3 -- So if we iter left to right now, node,left,right pattern
        System.out.println(postOrder(tree));//prints 1,2,6,4,2,4,3 -- So if we iter left to right now, node,left,right pattern
        System.out.println(deserializePostOrderPrint(postOrder(tree)));//prints 1,2,6,4,2,4,3 -- So if we iter left to right now, node,left,right pattern
        System.out.println(postOrder(deserializePostOrderPrint(postOrder(tree))));//prints 1,2,6,4,2,4,3 -- So if we iter left to right now, node,left,right pattern
    }
}
