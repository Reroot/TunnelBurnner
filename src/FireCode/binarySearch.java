package FireCode;

import java.util.Arrays;

public class binarySearch {
	
	public boolean binSearchV1(int[] arr, int n) {
		int low = 0;
		int high = arr.length;
		int mid = 0;
		while(low < high) {
			//this is the most important statement,
			//mid will between the new high, and the new low
			//after the potential first iteration. 
			mid = low + (high-low)/2;
			if(arr[mid]== n || arr[0] == n) { //OR write while(low <= high) 
				return true;
			} else if(arr[mid] < n) {
				low = mid + 1;
			} else if(arr[mid] > n) {
				high = mid - 1;
			} else {
				return true;
			}
		}
		return false;
	}
	
	public static Boolean binarySearch(int[] arr, int n){
	    if (arr.length == 0) return false;
	    if (arr.length == 1) return arr[0] == n;
	    int mid = arr.length / 2;
	    if (arr[mid] == n) return true;
	    if (n < arr[mid]) return binarySearch(Arrays.copyOfRange(arr, 0, mid), n);
	    return binarySearch(Arrays.copyOfRange(arr, mid, arr.length), n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
