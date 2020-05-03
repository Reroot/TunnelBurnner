package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;



public class minDepthOfBinaryTreeBFS {
	public int minTreeDepth2(TreeNode root) {
	    //bfslevel
	    if(root == null) return 0;
	    TreeNode curr = root;
	    Queue<TreeNode> que = new LinkedList<TreeNode>();
	    que.offer(root);
	    int count = 1;
	    int cnt = 0;
	    while(que.size() > 0) {
	        cnt = que.size();
	        for(int i = 0;i<=cnt;i++) { //inital 1, break ++, 2nd iter,  2,3
	            if(curr.left == null && curr.right == null) {
	                return count;
	            }
	            if(curr.left != null) {
	                que.offer(curr.left);
	            }
	            if(curr.right != null) {
	                que.offer(curr.right);
	            }
	            curr = que.poll();  
	        }
	        count++;
	    }
	    return 0;
	}
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
