package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class numberOfFullNodesBinaryTree {
	//Passes 
	public int numberOfFullNodesPass(TreeNode root) {
		//BFS is best for this as it can level check a left and right, we can do top down, rather than a dfs
		    if(root == null) {return 0;}
		    Queue<TreeNode> que = new LinkedList<TreeNode>();
		    TreeNode curr = root;
		    que.offer(curr);//we know we have a least 1
		    int fullNodeCount = 0;//again since we passed root == null, we can start at 1
		    while(!que.isEmpty()) {
		        curr = que.poll();
		        if(curr.left != null && curr.right != null) {
		            fullNodeCount++;
		        } 
		        if(curr.left != null) {
		            que.offer(curr.left);
		        }
		        if(curr.right != null) {
		            que.offer(curr.right);
		        }
		    }
		    return fullNodeCount;
		}
	//PAsses 4/5 cases
	public int numberOfFullNodes(TreeNode root) {
		//BFS is best for this as it can level check a left and right, we can do top down, rather than a dfs
		    if(root == null) {return 0;}
		    Queue<TreeNode> que = new LinkedList<TreeNode>();
		    TreeNode curr = root;
		    que.offer(curr);//we know we have a least 1
		    int fullNodeCount = 0;//again since we passed root == null, we can start at 1
		    while(!que.isEmpty()) {
		        curr = que.poll();
		        if(curr.left != null && curr.right != null) {
		            fullNodeCount++;
		        }  
		              
		        int level = que.size();//1,2/4/8
		        
		        for(int i = 0;i<=level;i++) {
		            if(curr.left != null) {
		                que.offer(curr.left);
		            }
		            if(curr.right != null) {
		                que.offer(curr.right);
		            }
		        }
		    }
		    return fullNodeCount;
		}
	public static void main(String[] args) {
//	       BinaryTree tree_level = new BinaryTree(); 
//	        tree_level.root = new Node(2); 
//	        tree_level.root.left = new Node(7); 
//	        tree_level.root.right = new Node(5); 
//	        tree_level.root.left.right = new Node(6); 
//	        tree_level.root.left.right.left = new Node(1); 
//	        tree_level.root.left.right.right = new Node(11); 
//	        tree_level.root.right.right = new Node(9); 
//	        tree_level.root.right.right.left = new Node(4); 
//	  
//	        System.out.println(tree_level.getfullCount()); 
	}

}
