package BinaryTrees;

public class diameterOfBinaryTree {
//	The code is correct but the explanation is clearly wrong. So although the longest path doesn't 
//  have to go through the root node, it has to pass the root node of some subtree of the tree 
	// (because it has to be from one leaf node to another leaf node, otherwise we can extend it for free). The longest path that passes a given node as the ROOT node is T = left_height+right_height. So you just calculate T for all nodes and output the max T.
	//WHAT IS THE LONGEST PATH BETTWEN TWO NODE, IT's DIAMETER ONLY SPREAD OUT AT A LINKED LIST
//	Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
//
//	Example:
//	Given a binary tree
//	          1
//	         / \
//	        2   3
//	      4   5    
//	Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
//
//	Note: The length of path between two nodes is represented by the number of edges between them.
    int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        max = Math.max(max, left + right);
        
        return Math.max(left, right) + 1;
    }
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
	       tree.left = new TreeNode(2); 
	       tree.right = new TreeNode(2); 
	       tree.left.left = new TreeNode(6); 
	       tree.left.right = new TreeNode(4); 
	       tree.right.left = new TreeNode(4); //for seriralize binary tree
	       tree.right.right = new TreeNode(3);//the oppiste of a postorder print give
	}

}
