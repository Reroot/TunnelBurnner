package Heaps;

import java.util.PriorityQueue;

public class findKthLargest {
    public static int findKthLargest(int[] nums, int k) {
        //since we need it in sorted order, we know that it's k behind the highest number, order doesnt matter we 
    	//are looking at values. Use a priority que, so that the min, elements are in the front, we will need to pop
    	// len-k, which will give us the kth largest, not the kth like something normal
    	PriorityQueue<Integer> que = new PriorityQueue<Integer>();
    	for(int i = 0;i<nums.length;i++) {
    		que.add(nums[i]);//the heap will sort elements as they are inserted
    	}
    	int countToKthLargest = nums.length-k;
    	while(countToKthLargest-- != 0) {
    		que.poll();
            //will get the min head, num-len-k times, which will be equal to kth largest, 
    		//ex 12345, if k is 2 in sorted, 4 would be the kth largest, and we would poll 3 times
    	}
    	return que.peek();
    }
    //with a pivot sort
    public static int nthMin(int[] arr, int n){
        //System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        int p = 0;
        int[] sorted = new int[arr.length]; 
        for(int i = 1; i < arr.length; i++){
          if(arr[i] < arr[p]){
            sorted[start++] = arr[i];
          }
          else if(arr[i] > arr[p]){
            sorted[end--] = arr[i];
          }
        }
        sorted[start] = arr[p];
        //System.out.println(Arrays.toString(sorted));
        if(start + 1 == n){ // start+1 bc index starts at 0, but that's first smallest
          return sorted[start];
        } else if (start + 1 < n){
          return nthMin(Arrays.copyOfRange(sorted, start + 1, arr.length), n - start - 1);
        } else {
          return nthMin(Arrays.copyOfRange(sorted, 0, start), n);
        }
      }
    public static void main(String[] args) {
    	System.out.println(findKthLargest(new int[] {1,2,3,4,5}, 2));
    	System.out.println(nthMin(new int[] {1,5,4,3,2}, 2));
	}

}
//Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
//
//Example 1:
//
//Input: [3,2,1,5,6,4] and k = 2
//Output: 5
//Example 2:
//
//Input: [3,2,3,1,2,4,5,5,6] and k = 4
//Output: 4
//Note:
//You may assume k is always valid, 1 ≤ k ≤ array's length