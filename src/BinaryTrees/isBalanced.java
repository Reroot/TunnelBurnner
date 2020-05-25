package BinaryTrees;

public class isBalanced {

    public static boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        //need to hit both left and right trees from the root, while checking thier legth diff isn't greater than 1, abs will always make it
        //never negative so we will know that the diff doesn't eceed 1> or less than 0, the only 
        //two options are 1 and 0 diff for a balanced bin tree
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(check(root.left) - check(root.right)) <= 1;
    }
    
    public static int check(TreeNode r) {
        if(r == null) return 0;//but it will be bottom us as we start adding from out base case 0
        return Math.max(check(r.left), check(r.right))+1;//pull the longest consetuitive path of left and right
        
    }
    
    
	public static void main(String[] args) {
		   TreeNode tree = new TreeNode(1);
	       tree.left = new TreeNode(2); 
	       tree.right = new TreeNode(2); 
	       tree.left.left = new TreeNode(6); 
	       tree.left.right = new TreeNode(4); 
	       tree.right.left = new TreeNode(4); //for seriralize binary tree
	       tree.right.right = new TreeNode(3);//the oppiste of a postorder p
	       System.out.println(isBalanced(tree));
	}

}
