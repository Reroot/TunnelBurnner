package Google;

class Node {
	public int data;
	public Node left;
	public Node right;
	Node(int data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
public class longestConsecutiveSequenceinBinaryTree {
	public longestConsecutiveSequenceinBinaryTree(Node node) {
		//Use int array [1] as a var instead of an int
		int[] saveMax = new int[1];
		int target = 0;//whatever curr node data+1
		//intput, we need the next in sequence we
		//already know that it will be +1
		// NODE, COUNT, TARGET, MAX
		findMax(node.left,0,0,saveMax);
	}
	private void findMax(Node node, int count, int target, int[] saveMax) {
		if(node == null) {
			return;
		}
		if(node.data == target) {//the next seq +1, if 2 then target is 3
			count++;
		} else { //reset on a negative seq case
			count = 1;
		}
		saveMax[0] = Math.max(saveMax[0], count);
		findMax(node.left,0,node.data+1,saveMax);//node.val is the key
		findMax(node.right,0,node.data+1,saveMax);
	}

	public static void main(String[] args) {
	}

}
//Given a Binary Tree find the length of the longest path 
//which comprises of nodes with consecutive values in increasing
//order. Every node is considered as a path of length 1.