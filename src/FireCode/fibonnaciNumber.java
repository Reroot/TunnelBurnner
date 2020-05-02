package FireCode;

public class fibonnaciNumber {
	//O(n^2)
	public int fibOneRecursive(int n) {
	    if(n == 0) return 0;
	    if(n == 1) return 1;
	    //summartions start at the bottom - upwards
	    return fibOneRecursive(n-1)+fibOneRecursive(n-2);
	}
	
	// java.util.* and java.util.streams.* have been imported for this problem.
	// You don't need any other imports.

	public static int fibTwoIterative(int n) {
	    int x1 = 0;
	    int x2 = 1;
	    int ans = x1 + x2;
	    if(n == 0) return 0;
	    if(n == 1) return 1;
	    
	    while(n > 2) {
	        x1 = x2;
	        x2 = ans;
	        ans = x1 + x2;
	        n--;
	    }
	    return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//The Fibonacci Sequence is the series of numbers: 
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The next number is 
//found by adding up the two numbers before it.
//
//Write a recursive method fib(n) that returns the nth Fibonacci number. n is 0 indexed, which means that in the sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., n == 0 should return 0 and n == 3 should return 2. Assume n is less than 15.
//
//Even though this problem asks you to use recursion, more efficient ways to solve it include using an Array, or better still using 3 volatile variables to keep a track of all required values. Check out this blog post to examine better solutions for this problem.
//
//Examples:
//fib(0) ==> 0
//
//fib(1) ==> 1
//
//fib(3) ==> 2
//
//  Need a hand? Try o