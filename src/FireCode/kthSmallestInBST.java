package FireCode;

import java.util.PriorityQueue;
import java.util.Stack;

public class kthSmallestInBST {
	//Best solution, inital inutiton as well, inorder dfs pattern
	 public int kthSmallest3(TreeNode root, int k) {
	     Stack<TreeNode> stack = new Stack<>();
	     while(root != null || !stack.isEmpty()) {
	         while(root != null) {
	             stack.push(root);    
	             root = root.left;   
	         } 
	         root = stack.pop();
	         if(--k == 0) break;
	         root = root.right;
	     }
	     return root.data;
	 }
	 //Really good
	 public int kthSmallestRecursive2(TreeNode root, int k) {
	        PriorityQueue<Integer> heap = new PriorityQueue<>();
	        createHeap(heap, root);
	        for (int i = 1; i < k; i++){   
	            heap.poll();
	        }
	        return heap.peek();
	    }
	    
	    private void createHeap(PriorityQueue<Integer> heap, TreeNode root){
	        if (root == null) return;
	        createHeap(heap, root.left);
	        createHeap(heap, root.right);
	        heap.offer(root.data);
	    }
	//Passing own solution <3 
    public int kthSmallest1(TreeNode root, int k) {
        TreeNode curr = root;
        //traverse inorder, add all to a priority que, or stack beaucse this is a bst, so k pops will give us an answer
        Stack<TreeNode> stk = new Stack<TreeNode>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        while(curr != null || !stk.isEmpty()) {
            while(curr != null) {
                stk.push(curr);//in order becuase we need it to get kth
                curr = curr.left;
            }//once we are at the bbotth we have the smallest
            curr = stk.pop();
            pq.offer(curr.data);
            curr = curr.right;
        }
        while(k-- > 1) {
            pq.poll();
        }
        return pq.poll();
    }
}