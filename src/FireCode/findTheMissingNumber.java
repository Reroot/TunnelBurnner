/**
 * 
 */
package FireCode;

import java.util.Arrays;

/**
Given an Array containing 9 numbers ranging from 1 to 10, 
write a method to find the missing number. Assume you have 
9 numbers between 1 to 10 and only one number is missing.
findMissingNumber({1,2,4,5,6,7,8,9,10}) --> 3
//UNSORTED
 */
public class findTheMissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try 1, 14 mins O(nlogn)
		findMissingM1(new int[] {1,2,4});
		//logn, streams
		findMissingM2(new int[] {1,2,4});
		//with map
		findMissingM3(new int[] {1,2,4});

	}
	private static int findMissingM3(int[] arr) {
		//add all to 
		return 0;
		// TODO Auto-generated method stub
		
	}
	private static int findMissingM2(int[] arr) {
		    return 55 - Arrays.stream(arr).sum();
	}
	private static int findMissingM1(int[] arr) {
	    //we know the next number is always + 1
	    //the range is 10
	    Arrays.sort(arr);
	    for(int i=0;i<arr.length - 1;i++) {
	        if(arr[i] == (arr[i+1] - 1)) {
	            continue;
	        } else {
	    		System.out.println(arr[i] + 1);
	            return arr[i] + 1;
	        }
	    }
	    return 0;
	}

}
