package BinaryTrees;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class isBalanced {
	public int what = 0;
    public static boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        //need to hit both left and right trees from the root, while checking thier legth diff isn't greater than 1, abs will always make it
        //never negative so we will know that the diff doesn't eceed 1> or less than 0, the only 
        //two options are 1 and 0 diff for a balanced bin tree
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(check(root.left) - check(root.right)) <= 1;
    }
    
    public static int check(TreeNode r) {
        if(r == null) return 0;//or -1 this is the case if balanced, becuase
        //root node, left -1, right -1 then -1-(-1) = 0 a blanced tree
        //-1-(-2) = 1, still balanced
        int what = Math.max(check(r.left), check(r.right))+1;
        return what;//pull the longest consecutive path of left and right
        
    }
    
    //2nd way more undertandable
    public static boolean isBalanced2(TreeNode root) {
        if(root==null){
            return true;
        }
        return checkStyle2(root)!=-1;
        
    }
    public static int checkStyle2(TreeNode node){ //We sub -1 is enough to break the case, for
    	//every +1 there needs to be a -1 otherwise it's not balanced
        if(node==null){
            return 0;
        }
        int lH=checkStyle2(node.left);//left until we hit a null first, so 0,0,0
        if(lH==-1){
            return -1;
        }
        int rH=checkStyle2(node.right);//then right, then hit return as +1
        if(rH==-1){
            return -1;//so right rh is 2 now check left, subtract evey iter up
        }
        if(lH-rH<-1 || lH-rH>1){
            return -1;
        }
        return Math.max(lH,rH)+1;//get the longest path side
    }
    
    public boolean isBalancediterative(TreeNode root) {
        if(root==null) return true;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Map<TreeNode, Integer> map = new HashMap<TreeNode, Integer>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if((node.left==null || node.left!=null && map.containsKey(node.left)) &&(node.right==null || node.right!=null && map.containsKey(node.right))){
                int left = node.left==null?0:map.get(node.left);
                int right = node.right==null?0:map.get(node.right);
                if(Math.abs(left-right) > 1) return false;
                map.put(node, Math.max(left, right)+1);
            }else{
                if(node.left!=null && !map.containsKey(node.left)){
                    stack.push(node);
                    stack.push(node.left);
                }else{
                    stack.push(node);
                    stack.push(node.right);
                }
            }
        }
        return true;
    }

    
	public static void main(String[] args) {
		   TreeNode tree = new TreeNode(1);
	       tree.left = new TreeNode(2); 
	       tree.right = new TreeNode(3); 
	       tree.left.left = new TreeNode(6); 
	       tree.left.right = new TreeNode(4); 
	       tree.right.left = new TreeNode(8); //for seriralize binary tree
	       tree.right.right = new TreeNode(10);//the oppiste of a postorder p
	       System.out.println(isBalanced2(tree));
	}

}
