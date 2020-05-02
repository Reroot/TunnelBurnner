package FireCode;

import java.util.LinkedList;
import java.util.Queue;

public class findNodeInABinaryTreeNoRecursionLevelOrderBFS {
	//first try 3/6 test past, Very close, prob works with mods
	public TreeNode findNode(TreeNode root, int val) {
	    if(root == null) return root;
	    if(root.data == val) {
	        return root;
	    }
	    //level order, bfs
	    TreeNode curr = root;
	    TreeNode prev = null;//dont really need this
	    //add outside
	    Queue<TreeNode> q = new LinkedList();
	    while(curr != null) {
	        q.offer(curr);
	        while(!q.isEmpty()) {//only need one while
	            prev = q.poll();
	            if(prev.data == val) {
	                 return prev;//break instead
	            }
	            if(prev.left != null) {
	                q.offer(prev.left);//use add
	            }
	            if(prev.right != null) {
	                q.offer(prev.right);
	            }
	        }
	        //break into this
	        if(prev.data == val) {//final check shold be outside
	            return prev;
	        }//need else null
	    }
	    
	    return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//			1. If root is null, return null.
//			2. Else, create a Queue object that can store tree nodes.
//			3. Enqueue the root.
//			4. Run a loop till the Queue becomes empty.
//			5. Within the loop, dequeue a node and compare its value with the input value.
//			6. If the data matches, break out of the loop, else insert its left and right nodes into the Queue.
//			7. Return the node, if match is found, else return null
}
