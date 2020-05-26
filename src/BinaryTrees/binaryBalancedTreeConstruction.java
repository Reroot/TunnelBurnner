package BinaryTrees;

public class binaryBalancedTreeConstruction {

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//	int data;
//
//    TreeNode(int val) {
//	    this.data = val;
//	    this.val = val;
//	    this.left = left;
//	    this.right = right;
//    }
//}
	//Pass first try!
	public static TreeNode search(TreeNode root, int target) {
		if(root == null) return root;
		//if(root == null && target == 0) return root;
		if(root.val < target) {
			return search(root.right, target);
		} else if(root.val > target) {
			return search(root.left, target);
		} else {
			return root;
		}
	}
	
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val); //all the way left first
        } else {
            root.right = insertIntoBST(root.right, val); //then start going right
        }
        return root; 
    }
    public TreeNode insertIntoBST2(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        helperbst2(root, val);
        return root;
    }
    private void helperbst2(TreeNode root, int val){
        if(root.val < val && root.right == null){
            root.right = new TreeNode(val);
        }else if(root.val > val && root.left == null){
            root.left = new TreeNode(val);
        }else if(root.val > val){
        	helperbst2(root.left, val);
        }else{
        	helperbst2(root.right, val);
        }
    }
    
    //Find the node to be removed and its parent using binary search, 
    //and then use deleteRootNode to delete the root node of the subtree
    //and return the new root node. This idea is taken from 
    //https://discuss.leetcode.com/topic/67309/an-easy-understanding-o-h-time-o-1-space-java-solution.

    private TreeNode deleteRootNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null) {
            return root.right;
        }
        if (root.right == null) {
            return root.left;
        }
        TreeNode next = root.right;
        TreeNode pre = null;
        for(; next.left != null; pre = next, next = next.left);
        next.left = root.left;
        if(root.right != next) {
            pre.left = next.right;
            next.right = root.right;
        }
        return next;
    }
    
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode cur = root;
        TreeNode pre = null;
        while(cur != null && cur.val != key) {
            pre = cur;
            if (key < cur.val) {
                cur = cur.left;
            } else if (key > cur.val) {
                cur = cur.right;
            }
        }
        if (pre == null) {
            return deleteRootNode(cur);
        }
        if (pre.left == cur) {
            pre.left = deleteRootNode(cur);
        } else {
            pre.right = deleteRootNode(cur);
        }
        return root;
    }
	public static void delete(TreeNode root, int target) {
		
	}
	public static void main(String[] args) {


	}

}
