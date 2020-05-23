package BinaryTrees;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;



public class serizalize {

    
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
	    return sb.toString();
    }

    public String preOderserialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        Deque<TreeNode> stack = new ArrayDeque<>();
        while(root!=null || !stack.isEmpty()) {
            while(root!=null) {
                sb.append(root.val).append(",");
                stack.push(root);
                root=root.left;
            }
            sb.append("null").append(",");
            root = stack.pop().right;
        }
        return "["+sb.toString()+"null"+"]";
    }
    public static void main(String args[]) { 

    	TreeNode root = new TreeNode(0);
    	root.left.data = 10;
    }
    
}
//public class Codec {
//    private static final String spliter = ",";
//    private static final String NN = "X";
//
//    // Encodes a tree to a single string.
//    public String serialize(TreeNode root) {
//        StringBuilder sb = new StringBuilder();
//        buildString(root, sb);
//        return sb.toString();
//    }
//
//    private void buildString(TreeNode node, StringBuilder sb) {
//        if (node == null) {
//            sb.append(NN).append(spliter);
//        } else {
//            sb.append(node.val).append(spliter);
//            buildString(node.left, sb);
//            buildString(node.right,sb);
//        }
//    }
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        Deque<String> nodes = new LinkedList<>();
//        nodes.addAll(Arrays.asList(data.split(spliter)));
//        return buildTree(nodes);
//    }
//    
//    private TreeNode buildTree(Deque<String> nodes) {
//        String val = nodes.remove();
//        if (val.equals(NN)) return null;
//        else {
//            TreeNode node = new TreeNode(Integer.valueOf(val));
//            node.left = buildTree(nodes);
//            node.right = buildTree(nodes);
//            return node;
//        }
//    }
//}