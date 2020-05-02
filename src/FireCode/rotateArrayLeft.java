package FireCode;

import java.util.Stack;

//Rotate an array to the left by k positions without using extra space.k can be greater than the size of the array.
//
//Example:
//rotateLeft({1,2,3,4,5},2) --> {3,4,5,1,2}
//  Need a hand? Try out these hints, one at a time.



public class rotateArrayLeft {
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
	    arr = reverse(arr, 0, arr.length-1-k);
	    System.out.println(String.valueOf(arr));
	    arr = reverse(arr, 0, arr.length-k);//we sub 1 beacuse k is not 0 based
	    System.out.println(String.valueOf(arr));
	    arr = reverse(arr, k, arr.length-1);
	    System.out.println(String.valueOf(arr));
	    return String.valueOf(arr);
	}

	public static int[] reverse(int[] arr, int s, int h) {
	    while(s<=h) {
	        int temp = arr[s];
	        arr[s] = arr[h];
	        arr[h] = temp;
	        s++;
	        h--;
	    }
	    return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotateLeft(new int[] {1,2,3,4,5}, 2);
	}

}
