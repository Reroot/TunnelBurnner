package FireCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Rotate an array to the left by k positions without using extra space.k can be greater than the size of the array.
//
//Example:
//rotateLeft({1,2,3,4,5},2) --> {3,4,5,1,2}
//  Need a hand? Try out these hints, one at a time.



public class rotateArrayLeft {
	
	public static int[] rotateLeftTry4(int[] arr, int k) {
	    
		//This added 20+ mins to the problem, dont forget to wrap
		if(k > arr.length) {
	        k = k % arr.length; 
	    }
		
		//1.Use a que, we dont need to allocate new memmeory
	    //push 4 and 5 at len-2, now we have holes, so we shift len-k-1, and have a temp to the next len-k+1, for loop len-k, len times
	    
	    //2.or for loop into a que, and fill the same array accordingly with overwrites/
	    Queue<Integer> que = new LinkedList<Integer>();
	    for(int i = 0;i<arr.length;i++) {
	        que.offer(arr[i]);
	    }
	    int kthStart = (arr.length-k);//we need to excude the extra int, and sub 1 once
	    while(kthStart < arr.length) {//que head 1,2,3...
	        arr[kthStart] = que.poll();
	        kthStart++;
	    }// [][][][1][2]
	    int start = 0;
	    kthStart = (arr.length-k)-1;//NEED TO RESET THIS
	    while(start <= kthStart) {//que head 1,2,3...***WE NEED TO BREAK -1 BEFORE THE KTH PLACE AS IT"S ALREADY FILLED
	    	//IN THE LAST WHILE LOOP, YOU CAN DECIDE HOW TO FILL THE ARRAY BUT BE CAREFUL WITH OVERLAP
	        arr[start] = que.poll();
	        start++;
	    }// [3][4][5][1][2]
	    
	    return arr;
	    
	}
	//below is failed due to arrlength-k?? this
	//becuase the arr.length-k, we are putting in
	//what we need first in the second index, not the
	//start, 1,2 go in [][][][right here][]lent-2
	public static int[] rotateLeft2(int[] arr, int k) {
	    int[] save = new int[arr.length];
	    if(arr == null) return null;
	    int kk = k % arr.length-1;
	    Stack<Integer> stk = new Stack<Integer>();
	    for(int i =0;i<arr.length;i++) {
	    	stk.push(arr[i]);//stk after//5,4,3,2,1
	    }
	    //push out, 5,4,3 off the stack
	    
	    //Pop form len-k, fill right to left
	    for(int i = arr.length-k-1;0<i;i--) {
	    	//fill the back of save  with 5,4,3
	    	save[i] = stk.pop();
	    } //[3][4][5][][]
	    //stk = 2, 1
	    
	    //POP FROM len-k, fill left to right
	    for(int i = k;i<arr.length-k-1;i++) {
	    	//fill the back of save  with 5,4,3
	    	save[i] = stk.pop();
	    } //[x][x][x][2][1]
	    return arr;
	}


	public static String rotateLeft(int[] arr, int k) {
	    //reverse the whole array, then reverse 0-k, ex, "1,2,3,45", k=3, == 5,4,3,2,1 => 3,4,5,--then revers k-len 2,1
	    k = k % arr.length;
	    reverse(arr, 0, arr.length-1-k);
	    System.out.println(String.valueOf(arr));
	    reverse(arr, 0, arr.length-k);//we sub 1 beacuse k is not 0 based
	    System.out.println(String.valueOf(arr));
	    reverse(arr, k, arr.length-1);
	    System.out.println(String.valueOf(arr));
	    StringBuilder b = new StringBuilder();
	    
	    //CONVERT PRIMITIVE INT TO STRING ARRAY, THEN USE ARRAYS
	    String strArray[] = Arrays.stream(arr)
				.mapToObj(String::valueOf)
				.toArray(String[]::new);
	    return Arrays.toString(strArray);
	}

	public static void reverse(int[] arr, int s, int h) {
		if(arr == null || arr.length == 1) return;
	    while(s < h) {
	        int temp = arr[s];
	        arr[s] = arr[h];
	        arr[h] = temp;
	        s++;
	        h--;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(String.valueOf(rotateLeftTry4(new int[] {1,2,3,4,5}, 2)));
		
	}

}
