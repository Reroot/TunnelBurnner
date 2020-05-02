package Amazon;
class Node {
	Node left = null;
	Node right = null;
	int data = 0;
	Node(int data) {
		this.data = data;
	}
}
public class bTreeLowestCommonAncestor {
    //Root of the Binary Tree 
    Node root; 
  
    Node findLCA(int n1, int n2) 
    { 
        return findLCA(root, n1, n2); 
    } 
  
    // This function returns pointer to LCA of two given 
    // values n1 and n2. This function assumes that n1 and 
    // n2 are present in Binary Tree 
    Node findLCA(Node node, int n1, int n2) 
    { 
        // Base case 
        if (node == null) 
            return null; 
  
        // If either n1 or n2 matches with root's key, report 
        // the presence by returning root (Note that if a key is 
        // ancestor of other, then the ancestor key becomes LCA 
        if (node.data == n1 || node.data == n2) 
            return node; 
  
        // Look for keys in left and right subtrees 
        Node left_lca = findLCA(node.left, n1, n2); 
        Node right_lca = findLCA(node.right, n1, n2); 
  
        // If both of the above calls return Non-NULL, then one key 
        // is present in once subtree and other is present in other, 
        // So this node is the LCA 
        if (left_lca!=null && right_lca!=null) 
            return node; 
  
        // Otherwise check if left subtree or right subtree is LCA 
        return (left_lca != null) ? left_lca : right_lca; 
    } 
//	Given a Binary Tree with all unique values and two nodes value n1 and n2. 
//	The task is to find the lowest common ancestor of the given two nodes. 
//	We may assume that either both n1 and n2 are present in the tree or none of 
//	them is present. 
//
//	Input:
//	The first line of input contains the number of test cases T. For every test case, the first line of input contains two space-separated integers, denoting node values for which we want to find LCA,  and the second line will contain a string representing the tree as described below: 
	//n1 and n2, 6 and 8, where mod is 0, and the lowest
	
	//intut, go all the way down recuasily, and work up to first occuarnce 
	//of a shared node between the two nodes
//	Node lca(Node root, int n1,int n2)
//	{
//		if(root == null) {
//			return null;
//		}
//		if(root.left.data == n1 && root.right.data == n2) {
//			return root;//then root is lca
//		} else {
//			return lca(root, n1, n2);
//		}
//	}
	public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree(); 
//        tree.root = new Node(1); 
//        tree.root.left = new Node(2); 
//        tree.root.right = new Node(3); 
//        tree.root.left.left = new Node(4); 
//        tree.root.left.right = new Node(5); 
//        tree.root.right.left = new Node(6); 
//        tree.root.right.right = new Node(7); 
//        System.out.println("LCA(4, 5) = " + 
//                            tree.findLCA(4, 5).data); 
//        System.out.println("LCA(4, 6) = " + 
//                            tree.findLCA(4, 6).data); 
//        System.out.println("LCA(3, 4) = " + 
//                            tree.findLCA(3, 4).data); 
//        System.out.println("LCA(2, 4) = " + 
//                            tree.findLCA(2, 4).data); 

	}

}
