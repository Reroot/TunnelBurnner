package FireCode;

public class treeSumOfElements {
	
	public int sum(TreeNode root) { 
	    if(root == null) return 0;
	    return sum(root.right) + sum(root.left) + root.data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
