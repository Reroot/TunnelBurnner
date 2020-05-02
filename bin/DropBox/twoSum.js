// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example:

// Given nums = [2, 7, 11, 15], target = 9,

// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].
console.log(twoSum([2, 7, 11, 15], 9));
console.log(twoSumVar);
nums = [2, 7, 11, 15];
target = 9;

function twoSum(arr, target) {
	map = {};

	for (i = 0; i < arr.length; i++) {
		//comp
		x = target - arr[i];
		//if comp exists, return
		if (map[x] != null) {
			return [map[x], i];
		} else {
			//addd to map, map-value from arr,map-index of the array
			map[arr[i]] = i;
		}
	}
}

var twoSumVar = function(nums, target) {
	map = {};
	for (i = 0; i < nums.length; i++) {
		if (map[target - nums[i]] != null) {
			return [i, map[target - nums[i]]];
		} else {
			map[nums[i]] = i;
		}
	}
};
