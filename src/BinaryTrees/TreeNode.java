package BinaryTrees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
	int data;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
	    this.data = val;
	    this.val = val;
	    this.left = left;
	    this.right = right;
    }
}
