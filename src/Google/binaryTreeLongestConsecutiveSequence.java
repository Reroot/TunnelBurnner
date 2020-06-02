package Google;

import java.util.Stack;

public class binaryTreeLongestConsecutiveSequence {
//	Longest consecutive sequence in Binary tree
//	Given a Binary Tree find the length of the longest 
//	path which comprises of nodes with ***consecutive values
//	in increasing order. Every node is considered as a 
//	path of length 1.***
	
//A CONSECTIVE PATH DIFFERS BY ONLY ONE, TRICK BECUASE IT COUlD DIFFER BY MORE.
	int currCount = 0;
	int maxCount = 0;
    private void longestConsecutiveOne(TreeNode root) {
    	//core logic - if(root.)//we only increase to to the right, a left degree 
    	//breaks this, but since this is not a BST, it's just a b tree
    	// we need to test left and right

    	//case1 2 degree, left and right, starting node, starts the count
    	//case2 2 degree, left and right, midway node, breaks the count
    	
    	TreeNode curr = root;
    	//TreeNode curr = root;
    	Stack<TreeNode> stkL = new Stack<TreeNode>();//left
    	Stack<TreeNode> stkR = new Stack<TreeNode>();//right
    	
    	while(curr != null) {
    		
    	}
    	//update, ability to go left right and undo
    	if(root.left == null && root.val < root.right.val) {//right tunnel
    		maxCount = Math.max(maxCount, currCount++);
    		curr = curr.right;
    		stkR.push(curr);
    	} else {
    		currCount--;
    		stkR.pop();
    	}
    	
    	
    	
    	if(root.right == null && root.val < root.left.val) {//left tunnel
    		maxCount = Math.max(maxCount, currCount++);
    	} else {
    		currCount = 0;
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//what about this 
//Example 1:
//
//Input:
// 1
//  \
//   3
//  / \
// 35   4
//      \
//       5





//Example 1:
//
//Input:
//   1
//    \
//     3
//    / \
//   2   4
//        \
//         5
//Output:3
//Explanation:
//Longest consecutive sequence path is 3-4-5, so return 3.
//Example 2:
//
//Input:
//   2
//    \
//     3
//    / 
//   2    
//  / 
// 1
//Output:2
//Explanation:
//Longest consecutive sequence path is 2-3,not 3-2-1, so return 2.