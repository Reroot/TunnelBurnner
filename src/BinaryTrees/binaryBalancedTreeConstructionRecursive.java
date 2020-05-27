package BinaryTrees;

public class binaryBalancedTreeConstructionRecursive {

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
    
//    Recursively find the node that has the same value as the key, while setting the left/right nodes equal to the returned subtree
//    Once the node is found, have to handle the below 4 cases
//    node doesn't have left or right - return null
//    node only has left subtree- return the left subtree
//    node only has right subtree- return the right subtree
//    node has both left and right - find the minimum value in the right subtree, set that value to the currently found node, then recursively delete the minimum value in the right subtreeme-o-1-space-java-solution.
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }else if(key > root.val){
            root.right = deleteNode(root.right, key);
        }else{ //This else case means we found the key to delete
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            
            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, root.val);
        }
        return root;
    }

    private TreeNode findMin(TreeNode node){
        while(node.left != null){
            node = node.left;
        }
        return node;
    }
    
	public static void main(String[] args) {


	}

}
