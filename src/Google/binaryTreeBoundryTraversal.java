package Google;

import java.util.ArrayList;
import java.util.List;

//Best explaination https://www.youtube.com/watch?v=uemjIijtu2I
public class binaryTreeBoundryTraversal {
	//1. gather all nodes in a preoder fasion, print right away, ignore the leaf and we will iterate them seprately
	//2. gather all right nodes
		public static List<Integer> boundaryOfBinaryTree(TreeNode root){
			List<Integer> res = new ArrayList<Integer>();
			if(root == null)
				return res;
			res.add(root.val);
			leftSubtree(root.left, res);
			leaves(root.left, res);
			leaves(root.right, res);
			rightSubtree(root.right, res);
			return res;
		}
		//leftSubtree
		public static void leftSubtree(TreeNode root, List<Integer> res) {
			if(root==null || root.left==null && root.right==null)
				return;
			res.add(root.val);
			if(root.left !=null)
				leftSubtree(root.left, res);
			else //if(root.right!=null)
				leftSubtree(root.right, res);
		}
		
		//rightSubtree
		public static void rightSubtree(TreeNode root, List<Integer> res) {
			if(root==null || root.left==null && root.right==null)
				return;
			if(root.right!=null)
				rightSubtree(root.right, res);
			else //if( root.left!=null)
				rightSubtree(root.left, res);
			res.add(root.val);
		}

		//leaves
		public static void leaves(TreeNode root, List<Integer> res) {
			if(root==null)
				return;
			if(root.left==null && root.right==null)
				res.add(root.val);
			leaves(root.left, res);
			leaves(root.right, res);
		}
		
		
		public static void main(String[] args) {

			TreeNode root= new TreeNode(1);
			root.left = new TreeNode(2);
			root.right =new TreeNode(3);
			root.left.left = new TreeNode(4);
			root.left.right = new TreeNode(5);
			root.left.right.left = new TreeNode(7);
			root.left.right.right = new TreeNode(8);
			root.right.left =new TreeNode(6);
			root.right.left.left =new TreeNode(9);
			root.right.left.right =new TreeNode(10);
			List<Integer> res = boundaryOfBinaryTree(root);
			for(int i=0; i<res.size(); i++) {
				System.out.println(res.get(i));
			}
		}
	}
	
	
//	Boundary Traversal Of Binary Tree
//	Given a binary tree. Given a binary tree, return the values of its boundary in anti-clockwise direction starting from the root.
//	Boundary includes left boundary, leaves, and right boundary in order without duplicate nodes.
//	
//	Left boundary is defined as the path from the root to the left-most node.
//	Right boundary is defined as the path from the root to the right-most node.
//	If the root doesn’t have left subtree or right subtree, then the root itself is left boundary or right boundary.
//	Note this definition only applies to the input binary tree, and not applies to any subtrees.
//	
//	The left-most node is defined as a leaf node you could reach when you always firstly travel to the left subtree if exists. If not, travel to the right subtree. Repeat until you reach a leaf node.
//	
//	The right-most node is also defined by the same way with left and right exchanged.
//	
//	Return an array of integers denoting the boundary values of tree in anti-clockwise order.
//	
//	For Example
//	
//	Input 1:
//	               _____1_____
//	              /           \
//	             2             3
//	            / \            / 
//	           4   5          6   
//	              / \        / \
//	             7   8      9  10  
//	Output 1:
//	    [1, 2, 4, 7, 8, 9, 10, 6, 3]
//	    Explanation 1:
//	        The left boundary are node 1,2,4. (4 is the left-most node according to definition)
//	        The leaves are node 4,7,8,9,10.
//	        The right boundary are node 1,3,6,10. (10 is the right-most node).
//	        So order them in anti-clockwise without duplicate nodes we have [1,2,4,7,8,9,10,6,3].
//	        
//	Input 2:
//	                1
//	               / \
//	              2   3
//	             / \  / \
//	            4   5 6  7
//	Output 2:
//	     [1, 2, 4, 5, 6, 7, 3] 
//

