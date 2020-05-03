package BinaryTrees;

public class serializeBinarySearchTree {
	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.
//CLUSTERFUCK but good try
//	public String serializeTree(TreeNode root){
//	    //covert bst to str, recurse from in order, then restore inordder
//	    TreeNode curr = root;
//	    Stack<TreeNode> stk = new Stack<TreeNode>();
//	    StringBuilder sb = new StringBuilder();
//	    while(!stk.isEmpty() || curr != null) {//still o(n) as increasing wont increase the complexity
//	        while(curr != null) {
//	            stk.push(curr);
//	            curr = curr.left;
//	        }
//	        curr = stk.pop();
//	        sb.append(curr.data);
//	        curr = curr.right;
//	    }
//	    return sb.toString();
//	}
//
//	public TreeNode restoreTree(String str){
//	    //rebuild tree
//	        //covert bst to str, recurse from in order, then restore inordder
//	    strIter = str.toCharArray();
//	    TreeNode curr = root;
//	    Deque<TreeNode> que = new LinkedList<TreeNode>();
//	    Stack<TreeNode> stk = new Stack<TreeNode>();
//	    for(int x : strIter) { //so que is 1,2,3tail
//	        que.offer(new TreeNode(x));
//	    }//we know the size before hand and so where the n/2 will be, use peak as root
//	    int countQ = que.size();
//	    int mid = countQ/2;
//	    
//	    for(--countQ > mid) { //so que is 1,2,3tail
//	        stk.push(que.pop());
//	    }//we know the size before hand and so where the n/2 will be, use peak as root
//	    //3
//	    TreeNode root = stk.pop();//last thing will be mid
//	    TreeNode curr = root;//3
//	    while(!que.isEmpty() || curr != null) {//still o(n) as increasing wont increase the complexity
//	        while(curr != null) {
//	            ////leftover in the stack is the lesser left, 
//	            curr.left = stk.pop();//build from the rest of the lest, as root the last node of the stack was the highest
//	            stk.push(c);
//	        }//rebuild right from root
//	        curr.right = que.poll();//poll heads are lesser out wards from the root. 
//	        
//	    }
//	    
//	    return root;
//	    
//
//	    
//	    recurseBuild();
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
