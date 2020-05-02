package FireCode;

public class isListEven {
	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.

	public Boolean isTheListEven(ListNode head) {
	    ListNode curr = head;
	    int count = 0;
	    if(curr == null) return true; 
	    while(curr != null) { //incude the curr, instead of curr.next the inc outside the loop
	        curr = curr.next;
	        ++count;
	    }

	    return (count % 2 == 0 ? true : false);


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
