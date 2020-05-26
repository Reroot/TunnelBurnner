package BinaryTrees;

public class binarySTIdentital {
	
	//passes 4/6 cases, need to traverse along
	public boolean isIdentical(TreeNode root1, TreeNode root2) {
	    //idendital if value and loc is the same
	    if(root1== null && root2 == null) {
	        return true;
	    } else if(root1 == null || root2 == null){
	        return false;
	       
	    }
	    //else if this was the problem, it should be check in the isienital traversal 
	    if(root1.val == root2.val) {
	        return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
	    } else {
	        return isIdentical(root1, root2);
	    }
	}
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2); 
        tree.right = new TreeNode(2); 
        tree.left.left = new TreeNode(6); 
        tree.left.right = new TreeNode(4); 
        tree.right.left = new TreeNode(4); //for seriralize binary tree
        tree.right.right = new TreeNode(3);
	}

}
