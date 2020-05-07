package Search;


import java.util.*;

public class threeSum {
    private static int n3;
	public static List<List<Integer>> threeSum(int[] nums) {
	    List<List<Integer>> res = new LinkedList<>(); 

    	Arrays.sort(nums);
    	
    	for(int i = 1;i<nums.length;i++) {//binary search for num[i] + num[i+1] + ? = 0;
    		if(i == 0 || i>0 && nums[i] != nums[i-1]) {
    			//make sure avoid duplicates
    			//WE WILL GO THROUGH ALL OF I, and will ajust high and low 
        		n3 = 0 - nums[i];//act as current iter, and i index, low is 1 ahead
        		int low = i+1;
        		int high = nums.length-1;
        		
        		while(low < high) {
        			if(nums[low]+nums[high] == n3) {//n1+n2=0-n3//comp ans
        				
        			ArrayList<Integer> ar = new ArrayList<Integer>();
        			
        			ar.add(low+1);
        			ar.add(high);
        			ar.add(i);
        			res.add(ar); 
        			
        			while(nums[low] == nums[low+1]) low++;//skip dups
        			while(nums[high] == nums[high-1]) high--;//skip dups
        			low++;
        			high--;
    	    		} else if(nums[low]+nums[high] < n3) {//our value will be somehwere in
    	    			//between low and high, the target is n3 comp, since we are sorted we can walk through better
    	    			low++;
    	    		} else {// n1+n2>n3
    	    			high--;
    	    		}
        		}
    		}
    		

    		
    	}
    	
    	
		return res;
        
    }
	public static void main(String[] args) {
		System.out.println(threeSum(new int[] {-1, 0, 1, 2, -1, -4}));

	}

}
//Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//
//Note:
//
//The solution set must not contain duplicate triplets.
//
//Example:
//
//Given array nums = [-1, 0, 1, 2, -1, -4],
//
//A solution set is:
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]