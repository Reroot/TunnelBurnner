package Google;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


//https://leetcode.com/problems/binary-tree-paths/discuss/68278/My-Java-solution-in-DFS-BFS-recursion
public class binaryTreePaths {//DO ALL FORMS!!!
	public List<String> binaryTreePaths2(TreeNode root) {
	    List<String> answer = new ArrayList<String>();
	    if (root != null) searchBT(root, "", answer);
	    return answer;
	}
	private void searchBT(TreeNode root, String path, List<String> answer) {
	    if (root.left == null && root.right == null) answer.add(path + root.val);
	    if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
	    if (root.right != null) searchBT(root.right, path + root.val + "->", answer);
	}
		
//	//INCORRECT
//		static StringBuilder sb = new StringBuilder();
//		static LinkedList<String> a = new LinkedList<String>();
//	    public static List<String> binaryTreePaths(TreeNode root) {
//	    	//dfs to get to roots
//	    	
//	    	if(root == null) { a.add(String.valueOf(root.data)); return a; }
//			return recInorder(root);
//	    }
//		private static List<String> recInorder(TreeNode root) {
//			if(root.left == null && root.right == null) {
//				//we hit an end path, so add it
//				a.add(sb.toString());
//				sb.deleteCharAt(sb.length()-1);//remove the last node in the path
//			}
//			
//	    	if(root == null) { 
//	    		return null;
//	    	}
//	    	sb.append(String.valueOf(root.data));
//			recInorder(root.left);
//			recInorder(root.right);
//	    	
//	    	
//
//
//			
//			return a;
//		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    TreeNode root = new TreeNode(1); 
	    root.left = new TreeNode(2); 
	    root.right = new TreeNode(3); 
	    root.left.left = new TreeNode(4); 
	    root.left.right = new TreeNode(5); 
	    System.out.println(binaryTreePaths(root));
	    
	}

}
//257. Binary Tree Paths
//Easy
//Share
//Given a binary tree, return all root-to-leaf paths.
//Note: A leaf is a node with no children.
//Example:
//Input:
//
//   1
// /   \
//2     3
// \
//  5
//
//Output: ["1->2->5", "1->3"]
//
//Explanation: All root-to-leaf paths are: 1->2->5, 1->3