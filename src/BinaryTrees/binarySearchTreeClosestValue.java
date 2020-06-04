package BinaryTrees;

import java.util.Stack;
//https://www.cnblogs.com/grandyang/p/5237170.html
//https://www.programcreek.com/2014/05/leetcode-closest-binary-search-tree-value-java/#:~:text=LeetCode%20%E2%80%93%20Closest%20Binary%20Search%20Tree%20Value%20(Java),is%20closest%20to%20the%20target.&text=Recursively%20traverse%20down%20the%20root,greater%20than%20root%2C%20go%20right.
public class binarySearchTreeClosestValue {
	//recursive
	static int closer = Integer.MAX_VALUE;
	static int result = -1;
	public static final int closestValue(TreeNode root, int target) {
		//recursive inorder
		//Math.abs(root.val - target);//because target needs to be the lesser
		if(root == null) return -1;
		closefinder(root, target);
		return result;
		
	}
	private static void closefinder(TreeNode root, int target) {
		if(root == null) return;
		if(Math.abs(root.val-target) < closer) {//need to find the minimum between the two values
			closer = Math.abs(root.val-target);
			result = root.val;//result is the root of the one that causes the closest diffrence
		}
		//choose a side instead of just running, since this is a binary search tree
		if(target < root.val) closefinder(root.left, target);
		if(target > root.val) closefinder(root.right, target);
	}


	
	//Inorder Traversal using a stack, poping at the leftmost leaf first
	public final int closestValueInorder(TreeNode root, double target) {
		double d = Double.MAX_VALUE;
		int res = 0;
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode p = root;
		while (p != null || !s.empty()) {
			while (p != null) {
				s.push(p);
				p = p.left;
			}
			
			p = s.peek();
			s.pop();
			
			if (d >= Math.abs(target - p.val)) {
				d = Math.abs(target - p.val);
				res = p.val;
			}
			p = p.right;
		}
		return res;
	}
//Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.
	public static void main(String[] args) {
	}

}
