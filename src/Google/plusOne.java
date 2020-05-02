package Google;

import java.util.Arrays;

public class plusOne {
//	Given a non-negative number represented as an array of digits,
//	plus one to the number. The digits are stored such that the 
//	most significant digit is at the head of the list.
	public static String plusOne(int[] digits) {
		//start at end
		int end = digits.length-1;
		int n = digits.length;
		while(end >= 0) {
			if(digits[end] < 9) {
				digits[end]++;
				return Arrays.toString(digits);
			} 
			digits[end] = 0;
			--end;
		}
	    int[] newNumber = new int [n+1];//recreate
	    newNumber[0] = 1;
		return Arrays.toString(newNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = {9,9};
		int[] test2 = {1,2,3};
		System.out.println(plusOne(test1));
		System.out.println(plusOne(test2));

	}

}



//Given a non-negative number represented as an array of digits, plus one to the number.
//The digits are stored such that the most significant digit is at the head of the list.
//Understand the problem:
//The problem gives an array of digits, return a new array plus one to the number. 
//Note that the digits are stored such that the most significant digit is at the head of the list. 
//We can take several examples to show the problem:
//For the input array 123, the new array is 124.
//For the input array 99, the new array is 100. 
//
//Solution:
//The solution is again very similar to adding the two integers. So we can add from the last digit. Note the carry number after the loop iteration. 