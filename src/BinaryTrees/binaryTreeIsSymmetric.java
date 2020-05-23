package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;


public class binaryTreeIsSymmetric {
	public boolean isSymmetric(TreeNode root) {
	    return root==null || isSymmetricHelp(root.left, root.right);
	}

	private boolean isSymmetricHelp(TreeNode left, TreeNode right){
	    if(left==null || right==null)
	        return left==right;
	    if(left.val!=right.val)
	        return false;
	    return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
	}
	
	
	
//BFS & compare left right at each level, so use 4loop
//I DID MYSELF!!!! level order each side on it's own!!	
	public static boolean isSym(TreeNode root) {
		TreeNode currL = root;
		TreeNode currR = root;
		if(currL == null && currR == null) return true;
		Queue<TreeNode> queL = new LinkedList<TreeNode>();
		Queue<TreeNode> queR = new LinkedList<TreeNode>();

		queL.offer(currL);//offer the root to start sym
		queR.offer(currR);//offer the root to start sym
		while(currL != null && currR.right != null) {
			int levelL = queL.size();
			int levelR = queR.size();
			
			for(int i =0;i<levelL;i++) {
				if(currL.left != null) {
					queL.offer(currL.left);
				}
				if(currL.right != null) {
					queL.offer(currL.right);
				}
			}
			
			for(int i =0;i<levelR;i++) {
				if(currR.right != null) {
					queR.offer(currR.right);
				}
				if(currR.left != null) {
					queR.offer(currR.left);
				}
			}	
			currL = queL.poll();
			currR = queR.poll();
            if (currL.left != null && currR.right == null ||
            		currL.right != null && currR.left == null ||
            				currR.left != null && currL.right == null ||
            						currR.right != null && currL.left == null) return false;

		}
		return true;
	}
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2); 
        tree.right = new TreeNode(2); 
        tree.left.left = new TreeNode(3); 
        tree.left.right = new TreeNode(4); 
        tree.right.left = new TreeNode(4); 
        tree.right.right = new TreeNode(3);
        System.out.println(isSym(tree));
	}

}
