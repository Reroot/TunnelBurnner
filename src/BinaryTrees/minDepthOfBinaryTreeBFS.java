package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;



public class minDepthOfBinaryTreeBFS {
	public int minDepth(TreeNode root) {
	    if(root == null) return 0;
	    int depth = 1;
	    Queue<TreeNode> q = new LinkedList<TreeNode>();
	    q.offer(root);
	    while(!q.isEmpty()){
	        int size = q.size();
	        // for each level
	        for(int i=0;i<size;i++){
	            TreeNode node = q.poll();
	            if(node.left == null && node.right == null){
	                return depth;
	            }
	            if(node.left != null){
	                q.offer(node.left);
	            }
	            if(node.right != null){
	                q.offer(node.right);
	            }
	        }
	        depth++;
	    }
	    return depth;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
