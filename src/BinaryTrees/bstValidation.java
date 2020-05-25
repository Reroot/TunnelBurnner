package BinaryTrees;
//Given the root node of a Binary Tree, determine if it is a 
//Binary Search Tree.
//
//Examples:
//
//  
//          20
//        /   \
//      15    30
//     /  \
//    14  18     
//
//    output ==> true
//
//          20
//         /   \
//       30    15 
//      /  \                           
//     14  18     
//
//   output ==> false

import java.util.Stack;

public class bstValidation {
		//iterative sol 3
		public boolean isValidBST3(TreeNode root) {
		    if (root == null) return true;
		    Stack<TreeNode> stack = new Stack<>();
		    TreeNode pre = null;
		    while (root != null || !stack.isEmpty()) {
		       while (root != null) {
		          stack.push(root);
		          root = root.left;
		       }
		       root = stack.pop();
		       if(pre != null && root.val <= pre.val) return false;
		       pre = root;
		       root = root.right;
		    }
		    return true;
		 }
		
	
		//Check BST rec, sol 1
	    public boolean isValidBSTSlv(TreeNode root) {
	        if(root == null) return true;
	        //all needs to be true
			return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	    }
	    public boolean isValidBSTSlv(TreeNode root, long min, long max) {
	        if(root == null) return true;
	        if (root.val >= max || root.val <= min) return false;//range impossible the first time beucas eof bounds
	        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
	    }//curret,, vs passed in comparrision
	
	    
	    
    
		//Check both height and node data of BST, sol 2
	    public boolean isValidBST(TreeNode root) {
	        if(root == null) return true;
	        //all needs to be true
			return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE) && isValidBST(root.left) && isValidBST(root.right) && Math.abs(checkHeight(root.left)-checkHeight(root.right)) <= 1;
	        
	    }
	    public boolean isValidBST(TreeNode root, long min, long max) {
	        if(root == null) return true;
	        if (root.val >= max || root.val <= min) return false;//range impossible the first time beucas eof bounds
	        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
	    }//curret,, vs passed in comparrision
	    
		public int checkHeight(TreeNode root) {
			// TODO Auto-generated method stub
			if(root == null) return -1;
			return Math.max(checkHeight(root.left), checkHeight(root.right))+1;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}
}



	//FAIL
//	public static boolean validateBST(TreeNode root) {
//		//traverse inorder, check if left is less that prev node
//		//for right check if is higher as we go down
//		TreeNode curr = root;
//		int top = root.data;
//		if(root == null) { return true;}
//		return validateBSTsearch(curr.left, top) || validateBSTsearch(curr.right, top);
//	}
//	private static boolean validateBSTsearch(TreeNode curr, int top) {
//	    if(curr == null) return true;
//		if(curr.left.data > curr.data || curr.left.data > top) {
//			return false;
//		}
//		if(curr.right.data < curr.data || curr.right.data < top) {
//			return false;
//		}
//		return true;
//	}
