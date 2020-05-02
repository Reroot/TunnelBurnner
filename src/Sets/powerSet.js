/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsets = function(nums) {
	const set = new Set();
	set.add([]);
	for (let i = 0; i < nums.length; i++) {
		const subsets = [...set];
		console.log(subsets);

		subsets.forEach((subset) => {
			//slice the entire subset
			let newSubset = subset.slice(0);
			console.log(newSubset);
			newSubset.push(nums[i]);
			set.add(newSubset);
		});
	}
	return [...set];
};

console.log(subsets([1, 2, 3]));
