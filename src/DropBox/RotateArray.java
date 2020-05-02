package DropBox;
// Given an array, rotate the array to the right by k steps, where k is non-negative.

// Example 1:

// Input: [1,2,3,4,5,6,7] and k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]
// Example 2:

// Input: [-1,-100,3,99] and k = 2
// Output: [3,99,-1,-100]
// Explanation:
// rotate 1 steps to the right: [99,-1,-100,3]
// rotate 2 steps to the right: [3,99,-1,-100]
// Note:

// Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
// Could you do it in-place with O(1) extra space?
// The basic idea is that, for example, nums = [1,2,3,4,5,6,7] and k = 3, first we reverse [1,2,3,4], it becomes[4,3,2,1]; then we reverse[5,6,7], it becomes[7,6,5], finally we reverse the array as a whole, it becomes[4,3,2,1,7,6,5] ---> [5,6,7,1,2,3,4].

// Reverse is done by using two pointers, one point at the head and the other point at the tail, after switch these two, these two pointers move one position towards the middle.

// public class Solution {

// public void rotate(int[] nums, int k) {

//     if(nums == null || nums.length < 2){
//         return;
//     }
//this is if k is bigger we can wrap around
//     k = k % nums.length;
//     reverse(nums, 0, nums.length - k - 1);
//     reverse(nums, nums.length - k, nums.length - 1);
//     reverse(nums, 0, nums.length - 1);

// }

// private void reverse(int[] nums, int i, int j){
//     int tmp = 0;
//     while(i < j){
//         tmp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = tmp;
//         i++;
//         j--;
//     }
// }
// }

// Approach #2 Using Extra Array [Accepted]
// Algorithm

// We use an extra array in which we place every element of the array at its correct 
//position i.e. the number at index ii in the original array is placed at the index (i+k)%(length of array)(i+k). Then, we copy the new array to the original one.
//oerwrite
// Java

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }
}