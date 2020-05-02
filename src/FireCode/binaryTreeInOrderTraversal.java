package FireCode;

import java.util.*;


public class binaryTreeInOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root;

        while(cur!=null || !stack.empty()){
            while(cur!=null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.data);
            cur = cur.right;
        }//Inorder (Left, Root, Right

        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Binary tree: Tree where each node has up to two leaves
//
//1
/// \
//2   3
//Binary search tree: Used for searching. A binary tree where the left child contains only nodes with values less than the parent node, and where the right child only contains nodes with values greater than or equal to the parent.
//
//2
/// \
//1   3