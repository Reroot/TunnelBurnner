package FireCode;

import java.util.HashMap;

public class twoSum {
	public static int[] coupleSum(int[] numbers, int target) {
	    HashMap<Integer, Integer> m = new HashMap<>();
	    //index, valueatnumi
	    for(int i = 0;i<numbers.length;i++) {
	        int x = target-numbers[i];
	        if(m.containsKey(x)) {//get index
	            int [] arr = new int[2];
	            arr[0] = m.get(x)+1;
	            arr[1] = i+1;
	            return arr;
	        } else {
	            m.put(numbers[i], i);//get indexes
	        }
	    }
	    return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
