package FireCode;
//1st try
public class binaryTreeHeight {
	public int findHeight(TreeNode root) { 
	    if(root == null) return 0;
	    return Math.max(findHeight(root.right) + 1, findHeight(root.left) + 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
