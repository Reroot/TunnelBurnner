package GoogleFreeBalling;

public class plusOne {
	//109 / 109 test cases passed.
    public static int[] plusOneX(int[] digits) {
    	int len = digits.length-1;//need to get end value, so sub 1
    	while(len >= 0) {
    		if(digits[len] == 9) {
    			digits[len] = 0;
    			len--;
    		} else {
    			digits[len]++;
    			for(int c : digits) System.out.println(c);
    			return digits;//we can finish since were done with the problem
    		}
    	}
    	int[] unshift = new int[digits.length+1];
    	unshift[0] = 1;
    	for(int c : unshift) System.out.println(c);
		return unshift;
        
    }
	
	public static void main(String[] args) {
		System.out.print((plusOneX(new int[] { 9 , 9})));
	}

}
//Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
//
//The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
//
//You may assume the integer does not contain any leading zero, except the number 0 itself.
//
//Example 1:
//
//Input: [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Example 2:
//
//Input: [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.