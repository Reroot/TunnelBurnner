package BinaryTrees;

public class isBalanced {
	class Solution {
	    public boolean isBalanced(TreeNode root) {
	        if(root == null) return true;
	        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(check(root.left) - check(root.right)) <= 1;
	    }
	    
	    public int check(TreeNode r) {
	        if(r == null) return 0;
	        return Math.max(check(r.left), check(r.right))+1;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
