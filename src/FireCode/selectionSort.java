package FireCode;

public class selectionSort {
//	Selection sort offers improved performance over bubble sort, especially for arrays with a large number of elements. Where bubble sort accumulated the largest elements towards the end of the array, 
	//selection sort accumulates the smallest elements at the beginning of the array.
//
//	Write a method that uses the selection sort algorithm to sort an input array of integers. 
	//See the hints and click the red colored links for additonal details on the algorithm.
//
//	Examples:
//
//	selectionSortArray({1,5,2}) -> {1,2,5}
//
//	selectionSortArray({11}) -> {11}
//
//	selectionSortArray({}) -> {}
//	    {} -> [Empty] Array 
	public static int[] selectionSortArray2(int[] arr){
	    //i is head, j is tail
	    for(int i = 0;i<arr.length;i++) {
	        for(int j = i+1;j<arr.length;j++) {
	            if(arr[i]>arr[j]) {
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    return arr;
	}
	public static int[] selectionSortArray(int[] arr){
		//two forloops until the array is crushed and greater and lower are swaped
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	    return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Selection Sort
//Selection Sort is a sorting algorithm, specifically an in-place comparison sort. It has O(n2) time complexity, making it inefficient on large lists, and generally performs worse than the similar insertion sort.
//
//Selection sort is noted for its simplicity, and it has performance advantages over more complicated algorithms in certain situations, particularly where auxiliary memory is limited.
//
//Algorithm
//
//
//The algorithm divides the input list into two parts: the sublist of items already sorted, which is built up from left to right at the front (left) of the list, and the sublist of items remaining to be sorted that occupy the rest of the list. Initially, the sorted sublist is empty and the unsorted sublist is the entire input list. The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element in the unsorted sublist, exchanging it with the leftmost unsorted element (putting it in sorted order), and moving the sublist boundaries one element to the right.
//
//Example
//
//64 25 12 22 11 // this is the initial, starting state of the array
//11 25 12 22 64 // sorted sublist = {11} 
//11 12 22 25 64 // sorted sublist = {11, 12, 22}
//11 12 25 22 64 // sorted sublist = {11, 12}
//11 12 22 25 64 // sorted sublist = {11, 12, 22, 25}
//11 12 22 25 64 // sorted sublist = {11, 12, 22, 25, 64}
//From Wikipedia, the free encyclopedia.
//
//Big-O notation
//Worst case performance	О(n2)
//Best case performance	О(n2)
//Average case performance	О(n2)
//Worst case space complexity	O(1)