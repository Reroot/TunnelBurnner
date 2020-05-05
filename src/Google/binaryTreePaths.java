package Google;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//https://leetcode.com/problems/binary-tree-paths/discuss/68278/My-Java-solution-in-DFS-BFS-recursion
public class binaryTreePaths {//This is nomal bfs
	//BFS, add the paths inside the if statements
		//BFS - Queue
		public static List<String> binaryTreePaths3(TreeNode root) {
		    List<String> list=new ArrayList<String>();
		    Queue<TreeNode> qNode=new LinkedList<TreeNode>();
		    Queue<String> qStr=new LinkedList<String>();
		    if (root==null) return list;
		    qNode.add(root);
		    qStr.add("");
		    while(!qNode.isEmpty()) {
		        TreeNode curNode=qNode.remove();
		        String curStr=qStr.remove();
		        
		        if (curNode.left==null && curNode.right==null) list.add(curStr+curNode.val);
		        //these go down thier seaparate paths
		        if (curNode.left!=null) {
		            qNode.add(curNode.left);
		            qStr.add(curStr+curNode.val+"->");
		        }
		        if (curNode.right!=null) {
		            qNode.add(curNode.right);
		            qStr.add(curStr+curNode.val+"->");
		        }
		    }
		    return list;
		}
	//#1
	public static List<String> binaryTreePaths2(TreeNode root) {
	    List<String> answer = new ArrayList<String>();
	    if (root != null) searchBT(root, "", answer);
	    return answer;
	}
	private static void searchBT(TreeNode root, String path, List<String> answer) {
	    if (root.left == null && root.right == null) answer.add(path + root.val);
	    if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
	    if (root.right != null) searchBT(root.right, path + root.val + "->", answer);
	}
	//ALT without void, more like mine
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> res = new ArrayList<String>();
		String onepath = "";
		return helper(res, onepath, root);		
	}
	public List<String> helper(List<String> result, String path, TreeNode root) {
		if(root.left==null && root.right==null){
			path += root.val;
			result.add(new String(path));
		}
		path = path + root.val+"->";
		if(root.left!=null)
			helper(result, path, root.left);
		if(root.right!=null)
			helper(result, path, root.right);	
		return result;
		
	}

	public static void main(String[] args) {
			//   1
			// /   \
			//2     3
			// 
		//  5
	    TreeNode root = new TreeNode(1); 
	    root.left = new TreeNode(2); 
	    root.right = new TreeNode(3); 
	    root.left.left = new TreeNode(4); 
	    root.left.left = new TreeNode(5); 
	    System.out.println(binaryTreePaths3(root));
	    
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