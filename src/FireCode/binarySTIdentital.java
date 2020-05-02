package FireCode;

public class binarySTIdentital {
	
	//passes 4/6 cases, need to traverse along
	public boolean isIdentical(TreeNode root1, TreeNode root2) {
	    //idendital if value and loc is the same
	    if(root1== null && root2 == null) {
	        return true;
	    } else if(root1 == null || root2 == null){
	        return false;
	       
	    }
	    //else if this was the problem, it should be check in the isienital traversal 
	    if(root1.data == root2.data) {
	        return isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
	    } else {
	        return isIdentical(root1, root2);
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
