package FireCode;
//Given the root node of a Binary Tree, determine if it is a 
//Binary Search Tree.
//
//Examples:
//
//  
//          20
//        /   \
//      15    30
//     /  \
//    14  18     
//
//    output ==> true
//
//          20
//         /   \
//       30    15 
//      /  \                           
//     14  18     
//
//   output ==> false





public class bstValidation {
	//2nd try
	//root, min, max
	
	
	
	
	//FAIL
	public static boolean validateBST(TreeNode root) {
		//traverse inorder, check if left is less that prev node
		//for right check if is higher as we go down
		TreeNode curr = root;
		int top = root.data;
		if(root == null) { return true;}
		return validateBSTsearch(curr.left, top) || validateBSTsearch(curr.right, top);
	}
	private static boolean validateBSTsearch(TreeNode curr, int top) {
	    if(curr == null) return true;
		if(curr.left.data > curr.data || curr.left.data > top) {
			return false;
		}
		if(curr.right.data < curr.data || curr.right.data < top) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
