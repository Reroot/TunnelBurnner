package BinaryTrees;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//For example:
//Given binary tree [3,9,20,null,null,15,7],
//    3
//   / \
//  9  20
//    /  \
//   15   7
//return its level order traversal as:
//[
//  [3],
//  [9,20],
//  [15,7]
//]
public class levelOrderBST {
    public List<List<Integer>> leveQueue(TreeNode root) {
    	
    	Queue<TreeNode> queue = new LinkedList<>();
    	LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
    	if (root == null) return res;  
    	LinkedList<Integer> subList = new LinkedList<Integer>();
    	queue.offer(root);
    	while(!queue.isEmpty()) {
    		int cnt = queue.size(); 
    		for(int i = cnt;i>0;i--) {
    			TreeNode curr = queue.poll();
    			subList.add(curr.val);
    			if(curr.left != null) {
    				queue.offer(curr.left);
    			}
    			if(curr.right != null) {
    				queue.offer(curr.right);
    			}
    		}
    		res.add(subList);
    	}
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//List<List<Integer>> res = new ArrayList<>();  
//if (root == null) return res;  
//Queue<TreeNode> queue = new LinkedList<>();  
//queue.add(root);  
//while (!queue.isEmpty()) {  
//　　List<Integer> level = new ArrayList<>();  
//　　int cnt = queue.size();  
//　　for (int i = 0; i < cnt; i++) {  
//　　　　TreeNode node = queue.poll();  
//　　　　level.add(node.val);  
//　　　　if (node.left != null) {  
//　　　　　　queue.add(node.left);  
//　　　　}
//　　　　if (node.right != null) {  
//　　　　　　queue.add(node.right);  
//　　　　}  
//　　}  
//　　res.add(level);   
//}  
//return res;