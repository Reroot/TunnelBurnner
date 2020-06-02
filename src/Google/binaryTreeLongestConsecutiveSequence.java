package Google;

import java.util.Stack;

public class binaryTreeLongestConsecutiveSequence {
//	Longest consecutive sequence in Binary tree
//	Given a Binary Tree find the length of the longest 
//	path which comprises of nodes with ***consecutive values
//	in increasing order. Every node is considered as a 
//	path of length 1.***
//https://www.programcreek.com/2014/04/leetcode-binary-tree-longest-consecutive-sequence-java/
//A CONSECTIVE PATH DIFFERS BY ONLY ONE, TRICK BECUASE IT COUlD DIFFER BY MORE.
		//BFS 1 - Todo
	
		//DFS 2
	    int max;
	    public int longestConsecutive(TreeNode root) {
	        helper(root);
	        return max;
	    }
	 
	    private int helper(TreeNode t){
	        if(t==null){
	            return 0;
	        }
	 
	        int leftMax = helper(t.left);
	        int rightMax = helper(t.right);
	 
	        int leftTotal = 0;
	        if(t.left == null){
	            leftTotal = 1;
	        }else if(t.val+1 == t.left.val){
	            leftTotal = leftMax+1;    
	        }else{
	            leftTotal = 1;
	        }
	 
	        int rightTotal = 0;
	        if(t.right == null){
	            rightTotal = 1;
	        }else if(t.val+1 == t.right.val){
	            rightTotal = rightMax+1;    
	        }else{
	            rightTotal = 1;
	        }
	 
	        max = Math.max(max, leftTotal);
	        max = Math.max(max, rightTotal);
	 
	        int longer = Math.max(leftTotal, rightTotal);   
	 
	        return longer;
	    }    

	
	//DFS 2
	//A mess but good theory crafting - may will fix later
	int currCount = 0;
	int maxCount = 0;
    private int longestConsecutiveOne(TreeNode root) {
    	//core logic - if(root.)//we only increase to to the right, a left degree 
    	//breaks this, but since this is not a BST, it's just a b tree
    	// we need to test left and right

    	//case1 2 degree, left and right, starting node, starts the count
    	//case2 2 degree, left and right, midway node, breaks the count
    	
    	TreeNode curr = root;
    	//TreeNode curr = root;
    	Stack<TreeNode> stk = new Stack<TreeNode>();//left

    	
    	while(curr != null) {
    		stk.push(curr);
	    	if(root.right == null && 1+root.val == root.left.val) {//left tunnel bigger
	    		maxCount = Math.max(maxCount, currCount++);
	    		curr = curr.left;
	    		stk.push(curr);
	    	} else {
	    		currCount = 1;
	    		curr = stk.pop();
	    		curr = curr.left;
	    		stk.push(curr);
	    	}
	    	//update, ability to go left right and undo
	    	if(root.left == null && root.val+1 == root.right.val) {//right tunnel bigger
	    		maxCount = Math.max(maxCount, currCount++);
	    		curr = curr.right;
	    		stk.push(curr);
	    	} else {
	    		currCount = 1;
	    		curr = stk.pop();
	    		curr = curr.right;
	    		stk.push(curr);
	    	}
    	}
    	
    	return maxCount;
    	
    	

    	
    	

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