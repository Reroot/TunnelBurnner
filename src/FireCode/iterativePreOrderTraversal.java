package FireCode;
import java.util.ArrayList;
import java.util.Stack; 


//A binary tree node 
class Node { 
	int data; 
	Node left, right; 
	Node(int item) { 
		data = item; 
		left = right = null; 
	} 
} 

class BinaryTree { 
	public ArrayList<Integer> preorderItr3(Node root) {
		Node curr = root;
	    Stack<Node> stk = new Stack<Node>();
	    ArrayList<Integer> al = new ArrayList<Integer>();    
	    //root,left,right
	    if(root == null) return al;
	    stk.push(curr);
	    while(!stk.isEmpty()) {
	        curr = stk.pop();
	        al.add(curr.data);
	        if(curr.right != null) {//FIFO, the first out will then be, go with the right first becuase they will be last out
	            stk.push(curr.right);
	        }        
	        if(curr.left != null) {
	            stk.push(curr.left);
	        }
	    }
	    return al;
	}
	
	//bottom is WRONG BECUASE FIFO stack so go rootrightleft
//failed try, updated a bit commented out mistakes
	//winning try
	public ArrayList<Integer> preorderItrFailedTry(Node root) {
	    ArrayList<Integer> treeList = new ArrayList<Integer>();
	    if(root == null) return null;
	    //preorder root,left, right
	    Node curr = root;
	    Stack<Node> stk = new Stack<Node>();
	    stk.push(curr);
	    while(!stk.isEmpty()) {
	        //stk.push(curr);//dont push inside
			curr = stk.peek(); 
	        stk.pop();
	        treeList.add(curr.data);
	        if(curr.left != null) {
	            stk.push(curr.left);
	            //treeList.add(curr.data);
	        }
	        if(curr.right != null) {
	            stk.push(curr.right);
	            //treeList.add(curr.data);
	        }
	    }
	    return treeList;
	}
		


Node root; 
	
	void iterativePreorder() { 
		iterativePreorder(root); 
	} 

	// An iterative process to print preorder traversal of Binary tree 
	void iterativePreorder(Node node) { 
		// Base Case 
		if (node == null) { 
			return; 
		} 

		// Create an empty stack and push root to it 
		Stack<Node> nodeStack = new Stack<Node>(); 
		nodeStack.push(root); 

		/* Pop all items one by one. Do following for every popped item 
		a) print it 
		b) push its right child 
		c) push its left child 
		Note that right child is pushed first so that left is processed first */
		while (nodeStack.empty() == false) { 
			// Pop the top item from stack and print it 
			Node mynode = nodeStack.peek(); 
			System.out.print(mynode.data + " "); 
			nodeStack.pop(); 

			// Push right and left children of the popped node to stack 
			if (mynode.right != null) { 
				nodeStack.push(mynode.right); 
			} 
			if (mynode.left != null) { 
				nodeStack.push(mynode.left); 
			} 
		} 
	} 

	// driver program to test above functions 
	public static void main(String args[]) { 
		BinaryTree tree = new BinaryTree(); 
		tree.root = new Node(10); 
		tree.root.left = new Node(8); 
		tree.root.right = new Node(2); 
		tree.root.left.left = new Node(3); 
		tree.root.left.right = new Node(5); 
		tree.root.right.left = new Node(2); 
		tree.iterativePreorder(); 

	} 

}
//This code has been contributed by Mayank Jaiswal 

