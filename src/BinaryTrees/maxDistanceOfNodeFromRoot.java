package BinaryTrees;

public class maxDistanceOfNodeFromRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Given the root of a Binary Tree  and an integer that represents the data value of a TreeNode present in the tree, write a method - pathLengthFromRoot that returns the distance between the root and that node. You can assume that the given key exists in the tree. The distance is defined as the minimum number of nodes that must be traversed to reach the target node.
//
//Example:
//       1
//      / \
//     2   3
//      \   \     
//       4   5
//
//pathLengthFromRoot(root,5) => 3
//pathLengthFromRoot(root,1) => 1
//pathLengthFromRoot(root,3) => 2
//java.util.* and java.util.streams.* have been imported for this problem.
//You don't need any other imports.

//public int pathLengthFromRoot(TreeNode root, int n1) {
// //in order traversal, but inc the count everytime we go down, and dec root count evrytime we go up the tree
// TreeNode curr = root;
// TreeNode orgRoot = root;
// if(root == null || orgRoot == null) return 0;
// Stack<TreeNode> stk = new Stack<TreeNode>();
// int count = 0;
// while(!stk.isEmpty() || curr != null) {
//
//     while(curr != null) {
//         stk.push(curr);//push root
//         count++;//pushing curr we go down so increment count
//         curr = curr.left;
//     }
//     
//     curr = stk.pop();//count means going up, so we decrement the path count
//     
//     if(curr.data == orgRoot.data) {
//         count = 0;
//     }
//         if(curr.data == n1) {
//             return count;
//         } else {
//             count--;
//         }            
//     if(curr.right != null) {
//         curr = curr.right;
//         count++;
//     }
//     
//
//     
// }
// return count;
//}