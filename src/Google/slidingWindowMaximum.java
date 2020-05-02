package Google;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class slidingWindowMaximum {
    public static int[] slidingWinMaximum(int[] a, int k) {
		if (a == null || k <= 0) {
			return new int[0];
		}
		int n = a.length;
		int[] r = new int[n-k+1];
		int ri = 0;
		// store index
		Deque<Integer> q = new ArrayDeque<>();
		for (int i = 0; i < a.length; i++) {
			// remove numbers out of range k
			while (!q.isEmpty() && q.peek() < i - k + 1) {
				q.poll();
			}
			// remove smaller numbers in k range as they are useless
			while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
				q.pollLast();
			}
			// q contains index... r contains content
			q.offer(i);
			if (i >= k - 1) {
				r[ri++] = a[q.peek()];
			}
		}
		return r;
        
    }
//    partition the array in blocks of size w=4. The last block may have less then w.
//    		2, 1, 3, 4 | 6, 3, 8, 9 | 10, 12, 56|
//
//    		Traverse the list from start to end and calculate max_so_far. Reset max after each block boundary (of w elements).
//    		left_max[] = 2, 2, 3, 4 | 6, 6, 8, 9 | 10, 12, 56
//
//    		Similarly calculate max in future by traversing from end to start.
//    		right_max[] = 4, 4, 4, 4 | 9, 9, 9, 9 | 56, 56, 56
//
//    		now, sliding max at each position i in current window, sliding-max(i) = max{right_max(i), left_max(i+w-1)}
//    		sliding_max = 4, 6, 6, 8, 9, 10, 12, 56
    public static int[] slidingWindowMaxArray(final int[] in, final int w) {
        final int[] max_left = new int[in.length];
        final int[] max_right = new int[in.length];

        max_left[0] = in[0];
        max_right[in.length - 1] = in[in.length - 1];

        for (int i = 1; i < in.length; i++) {
            max_left[i] = (i % w == 0) ? in[i] : Math.max(max_left[i - 1], in[i]);

            final int j = in.length - i - 1;
            max_right[j] = (j % w == 0) ? in[j] : Math.max(max_right[j + 1], in[j]);
        }

        final int[] sliding_max = new int[in.length - w + 1];
        for (int i = 0, j = 0; i + w <= in.length; i++) {
            sliding_max[j++] = Math.max(max_right[i], max_left[i + w - 1]);
        }

        return sliding_max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		slidingWinMaximum(nums, k);
	}

}
//Given an array of integers A. There is a sliding window of size B which
//is moving from the very left of the array to the very right.
//You can only see the w numbers in the window. 
//Each time the sliding window moves
//rightwards by one position. You have to find the 
//maximum for each window.
//The following example will give you more clarity.
//
//The array A is [1 3 -1 -3 5 3 6 7], and B is 3.
//
//Window position	Max
//———————————-	————————-
//[1 3 -1] -3 5 3 6 7	3
//1 [3 -1 -3] 5 3 6 7	3
//1 3 [-1 -3 5] 3 6 7	5
//1 3 -1 [-3 5 3] 6 7	5
//1 3 -1 -3 [5 3 6] 7	6
//1 3 -1 -3 5 [3 6 7]	7
//Return an array C, where C[i] is the maximum value of from A[i] to A[i+B-1].
//
//Note: If B > length of the array, return 1 element with the max of the array.
//
//
//
//Input Format
//
//The first argument given is the integer array A.
//The second argument given is the integer B.
//Output Format
//
//Return an array C, where C[i] is the maximum value of from A[i] to A[i+B-1]
//For Example
//
//Input 1:
//    A = [1, 3, -1, -3, 5, 3, 6, 7]
//    B = 3
//Output 1:
//    C = [3, 3, 5, 5, 6, 7]
// NOTE: You only need to implement the given function. Do not read input, instead use the arguments to the function. Do not print the output, instead return values as specified. Still have a doubt? Checkout Sample Codes for more details