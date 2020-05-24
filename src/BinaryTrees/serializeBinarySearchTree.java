package BinaryTrees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class serializeBinarySearchTree {
	
	
	
	
	
	
	
	
	
	
	
	
	////

	  private static final String NULL_SYMBOL = "X";
	  private static final String DELIMITER = ",";

	  public String serialize(TreeNode root) {

	    // If we have a null symbol...we encode a null symbol
	    if (root == null) {
	      return NULL_SYMBOL + DELIMITER;
	    }

	    /*
	     * The key to tree problems is TO HAND OFF RESPONSIBILITY. Here we are saying...
	     * 
	     * "hey, I know what root's value is...ummmm...hey serialize()... can you encode
	     * my left and right subtrees?...Get back to me because ONLY THEN will I append
	     * myself"
	     */
	    String leftSerialized = serialize(root.left);
	    String rightSerialized = serialize(root.right);

	    // Here we append the node we hold ('root') to the other serializations
	    return root.val + DELIMITER + leftSerialized + rightSerialized;
	  }

	  /*
	   * Here we take the string and simply split it on the delimiter. We then have a
	   * list of values we can materialize into nodes
	   */
	  public TreeNode deserialize(String data) {
	    Queue<String> nodesLeftToMaterialize = new LinkedList<>();
	    nodesLeftToMaterialize.addAll(Arrays.asList(data.split(DELIMITER)));
	    return deserializeHelper(nodesLeftToMaterialize);
	  }

	  /*
	   * We use a queue here so we don't have to keep overarching state (since the
	   * question description bars us from doing so)
	   * 
	   * At any point in time when this function is called we will know the next node
	   * to materialize
	   * 
	   * We materialize a node, set its left and right subtrees respectively, and then
	   * return the node itself
	   */
	  private TreeNode deserializeHelper(Queue<String> nodesLeftToMaterialize) {

	    String valueForNode = nodesLeftToMaterialize.poll();

	    if (valueForNode.equals(NULL_SYMBOL)) {
	      return null;
	    }

	    TreeNode newNode = new TreeNode(Integer.valueOf(valueForNode));
	    newNode.left = deserializeHelper(nodesLeftToMaterialize);
	    newNode.right = deserializeHelper(nodesLeftToMaterialize);

	    /*
	     * How does the call to 'right' know where to pick up where the 'left' call
	     * left off?
	     * 
	     * Well, the queue ensures that whatever is at the front is the next node to
	     * process, we don't need to carry state between calls because the queue
	     * enforces that ordering itself
	     */

	    return newNode;
	  }
	}
//Serialization is the process of converting a data structure or object 
//into a sequence of bits so that it can be stored in a file or 
//memory buffer, or transmitted across a network connection link to be 
//reconstructed later in the same or another computer environment.
//
//Design an algorithm to serialize and deserialize a binary tree. 
//There is no restriction on how your serialization/deserialization 
//algorithm should work. You just need to ensure that a binary tree
//can be serialized to a string and this string can be deserialized 
//to the original tree structure.
//
//Example: 
//
//You may serialize the following tree:
//
//    1
//   / \
//  2   3
//     / \
//    4   5
//
//as "[1,2,3,null,null,4,5]"
//Clarification: The above format is the same as how LeetCode serializes a binary tree. You do not necessarily need to follow this format, so please be creative and come up with different approaches yourself.
//
//Note: Do not use class member/global/static variables to store states. Your serialize and deserialize algorithms should be stateless.
//BEST ANS BFS with MARKER METHOD
//public class Codec {
//
//    // Encodes a tree to a single string.
//    public String serialize(TreeNode root) {
//        if (root==null) return "";
//        Queue<TreeNode> qu=new LinkedList<>();
//        StringBuilder sb=new StringBuilder();
//        qu.offer(root);
//        sb.append(String.valueOf(root.val));
//        sb.append(' ');
//        while (!qu.isEmpty()) {
//            TreeNode x=qu.poll();
//            if (x.left==null) sb.append("null ");
//            else {
//                qu.offer(x.left);
//                sb.append(String.valueOf(x.left.val));
//                sb.append(' ');
//            }
//            if (x.right==null) sb.append("null ");
//            else {
//                qu.offer(x.right);
//                sb.append(String.valueOf(x.right.val));
//                sb.append(' ');
//            }
//        }
//        return sb.toString();
//    }
//
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        if (data.length()==0) return null;
//        String[] node=data.split(" ");
//        Queue<TreeNode> qu=new LinkedList<>();
//        TreeNode root=new TreeNode(Integer.valueOf(node[0]));
//        qu.offer(root);
//        int i=1;
//        while (!qu.isEmpty()) {
//            Queue<TreeNode> nextQu=new LinkedList<>();
//            while (!qu.isEmpty()) {
//                TreeNode x=qu.poll();
//                if (node[i].equals("null")) x.left=null;
//                else {
//                    x.left=new TreeNode(Integer.valueOf(node[i]));
//                    nextQu.offer(x.left);
//                }
//                i++;
//                if (node[i].equals("null")) x.right=null;
//                else {
//                    x.right=new TreeNode(Integer.valueOf(node[i]));
//                    nextQu.offer(x.right);
//                }
//                i++;
//            }
//            qu=nextQu;
//        }
//        return root;
//    }
//}
