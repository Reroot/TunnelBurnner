package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class numOfHalfNodes {
	//I did it!, careful with adding the root before starting the level order, as you don't iter an extra time
	public int numberOfHalfNodes(TreeNode root) { 
	    //level order with a check of left && right exist == 0, and else 1++
	    if(root == null) return 0;

	    TreeNode curr = root;
	    Queue<TreeNode> que = new LinkedList<TreeNode>();
	    que.offer(curr);
	    int hcount = 0;
	    while(!que.isEmpty()) {
	        int count = que.size();
	        for(int i = 0;i<count;i++) {//dont incude 0, as we already put it, so <, this makes sure a level finishes, level 2^0,2^1,2^2 
	            curr = que.poll();
	            
	            if(curr.left == null && curr.right != null || (curr.left != null && curr.right == null)) {
	                hcount++;
	            }
	            if(curr.left != null) {
	                que.offer(curr.left);
	            }
	            if(curr.right != null) {
	                que.offer(curr.right);
	            }
	        }
	        
	    }
	    return hcount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
