package BinaryTrees;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class binaryTreeDiameterBettweenTwoNodes {
//	So although the longest path doesn't 
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
	//without saiiving the max with memo or hash
	
	//simple with save
	static int max = 0;
    public static int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return max;
    }
    private static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        max = Math.max(max, left + right);
        return Math.max(left, right) + 1;
    }
	//bad complexity nlogn
	public int diameterOfBinaryTree4(TreeNode root) {
        if(root == null){
            return 0;
        }
       int dia = depth(root.left) + depth(root.right);
       int ldia = diameterOfBinaryTree4(root.left);
       int rdia = diameterOfBinaryTree4(root.right);
       return Math.max(dia,Math.max(ldia,rdia));
        
    }
    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+Math.max(depth(root.left), depth(root.right));
    }
	
	

    //The idea is to use Post order traversal which means make sure the node is there till the left and right childs are processed that's the reason you use peek method in the stack to not pop it off without being done with the left and right child nodes. Then for each node calculate the max of the left and right sub trees depth and also simultaneouslt caluculate the overall max of the left and right subtrees count.

    public int diameterOfBinaryTreeC(TreeNode root) {
            if( root == null){
                return 0;
            }
            int overallNodeMax = 0;
            Stack<TreeNode> nodeStack = new Stack<>();
            Map<TreeNode,Integer> nodePathCountMap = new HashMap<>();
            nodeStack.push(root);
            while(!nodeStack.isEmpty()){
                TreeNode node = nodeStack.peek();
                if(node.left != null && !nodePathCountMap.containsKey(node.left)){
                    nodeStack.push(node.left);
                }else if(node.right!=null && !nodePathCountMap.containsKey(node.right)){
                    nodeStack.push(node.right);
                }else {
                    TreeNode rootNodeEndofPostOrder = nodeStack.pop();
                    int leftMax = nodePathCountMap.getOrDefault(rootNodeEndofPostOrder.left,0);
                    int rightMax = nodePathCountMap.getOrDefault(rootNodeEndofPostOrder.right,0);
                    int nodeMax = 1 + Math.max(leftMax,rightMax);
                    nodePathCountMap.put(rootNodeEndofPostOrder,nodeMax);
                    overallNodeMax = Math.max(overallNodeMax,leftMax + rightMax );
                }
                
            }
            return overallNodeMax;
            
        }   

	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
	       tree.left = new TreeNode(2); 
	       tree.right = new TreeNode(2); 
	       tree.left.left = new TreeNode(6); 
	       tree.left.right = new TreeNode(4); 
	       tree.right.left = new TreeNode(4); //for seriralize binary tree
	       tree.right.right = new TreeNode(3);//the oppiste of a postorder print give
	       ;
	       System.out.print(diameterOfBinaryTree(tree));
	}

}
