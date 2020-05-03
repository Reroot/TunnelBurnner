package BinaryTrees;

public class binaryTreefindMax {
	int max = 0;
	int curmax = 0;
	public int findMax(TreeNode root) {
	    if(root == null) return 0;
	    curmax = root.val;
	    if(max < curmax) {
	        max = Math.max(max, curmax);
	    }
	    findMax(root.left);
	    findMax(root.right);
	    return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
