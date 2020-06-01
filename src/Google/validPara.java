package Google;

import java.util.Stack;

public class validPara {
    public static boolean isValid(String s) {
    	char[] arr = s.toCharArray();
    	Stack<Character> stk = new Stack<Character>();

    	for(int i =0;i<arr.length;i++) {
    		//BECUASE ONLY ONE OF THESE RUNS PER i-iteration, we don't need to do i+1
    		if(arr[i] == '(') {
    			stk.push(')');//push the one we need to verify on the stack
    		} else if(arr[i] == '[') {
    			stk.push(']');//push the one we need to verify on the stack
    		} else if(arr[i] == '{') {
    			stk.push('}');//push the one we need to verify on the stack
    		} else if(stk.isEmpty() || arr[i] != stk.pop()) {//stk should empty everytime
    			return false;
    		} 
    	}
		return true;
        
    }
 
    
	public static void main(String[] args) {
		System.out.println(isValid("()[]"));

	}

}
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Note that an empty string is also considered valid.
//
//Example 1:
//
//Input: "()"
//Output: true
//Example 2:
//
//Input: "()[]{}"
//Output: true
//Example 3:
//
//Input: "(]"
//Output: false
//Example 4:
//
//Input: "([)]"
//Output: false
//Example 5:
//
//Input: "{[]}"
//Output: true