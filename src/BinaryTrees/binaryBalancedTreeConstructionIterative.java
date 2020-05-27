package BinaryTrees;

import java.util.Stack;

public class binaryBalancedTreeConstructionIterative {
	//THIS WORKS ONLY IF THE TREE IS A BST!!!!!!!!!!!!!!! you spent a lot of time thiniking your wrong, make sure to understand exatly
	//and litererally what the problem is asking. 
    public static String searchBST(TreeNode root, int target) {
        //TreeNode curr = root;
        if(root == null) return "";
        if(root.val == target) return "";
        Stack<TreeNode> stk = new Stack<TreeNode>();
        
        if(root.val > target) {
            //curr = curr.left;
            stk.push(root.left);
        } else {
            //curr = curr.right;
            stk.push(root.right);
        } 
        
        while(!stk.isEmpty()) {
            TreeNode curr = stk.pop();

            if(curr != null) {
                if(curr.val == target) {
                    return "found";
                } 

                if(curr.val > target) {
                    //curr = curr.left;
                    stk.push(curr.left);
                } 

                if(curr.val < target)
                    //curr = curr.right;
                    stk.push(curr.right);
                } 


            }
            //for the next iteration
        return "not found";
        
    }
	public static void main(String[] args) {
			//BALANCED!
		   TreeNode tree = new TreeNode(4);
	       tree.left = new TreeNode(2); 
	       tree.right = new TreeNode(7); 
	       tree.left.left = new TreeNode(1); 
	       tree.left.right = new TreeNode(3); 
	       tree.right.left = new TreeNode(6); //for seriralize binary tree
	       tree.right.right = new TreeNode(10);//the oppiste of a postorder print gives us an ablity to build via preprder-IE prePLR, postLRP
	       System.out.println(searchBST(tree, 6));//prints 1,2,6,4,2,4,3 -- So if we 
	}

}
