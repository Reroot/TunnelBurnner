package BinaryTrees;
import java.util.LinkedList;
import java.util.Queue;

public class binaryTreeMinDepth {
//	Since you've been asked to find the Minimum Depth, your method should exit as soon as it finds a node with null left and right children. This then becomes a class BFS problem. When dealing with a tree BFS problem, you should immediately think of Level Order Traversal. Two Queues can be used to traverse a tree in Level Order. The first Queue holds the TreeNode s of the current level, and the second Queue holds those of the next level. When skipping to the next level, simply set the next level Queue to the current level Queue and create a new Queue for the next Level.
//	1. Initialize a variable depth to 1.
//
//	2. Create a Queue for the current level - Queue curLevel = new LinkedList<>();
//
//	3. Create a Queue for the next level - Queue nextLevel = new LinkedList<>();
//
//	4. Add root to curLevel. Setup a while loop that loops until curLevel becomes empty. Within the while loop, if you encounter a node with null left and right nodes, return the depth up til that point.
//
//	5. Inside the loop, .poll() a TreeNode from curLevel. If its left and right nodes are not null, add them to nextLevel. Check once again if curLevel is empty. If it is, we need to move over to the next level. Set curLevel to nextLevel and create a new LinkedList<>() for nextLevel, while incrementing depth by 1.
//	
	
	//first atempt fail
	public int minTreeDepth(TreeNode root) {
	    //The min depth of the tree will be the first node left or right that hits, null on both left and right
	    //so we can do a level order traversal, and stop it while using a count. So BFS
	    Queue<TreeNode> que = new LinkedList<TreeNode>(); 
	    que.add(root);
	    int min = 0;
	    int countL = 0;
	    int countR = 0;
	    if(root != null) {
	        countL++;
	        countR++;
	        min++;
	    }
	    while(!que.isEmpty()) {
	        //base case return
	        TreeNode curr = que.poll();
	        if(curr.left == null && curr.right == null) {
	            min++;
	            return min;
	        }
	        //bfs
	        if(curr.left != null) {
	                    countL++;
	                    min = Math.min(min, countL);
	            que.offer(curr.left);
	        }
	        if(curr.right != null) {
	                    countR++;
	                    min = Math.min(min, countR);
	            que.offer(curr.right);
	        }
	    }
	    return min;
	    

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
