// Given an array of strings, group anagrams together.

// Example:

// Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Output:
// [
//   ["ate","eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]
// Note:

// All inputs will be in lowercase.
// The order of your output does not matter.

var groupAnagrams = function(strs) {
	//sorted anagrams will match into there bracket
	//new array in a map is made if the key doens't exist
	//group map
	let group = {};
	for (i = 0; i < strs.length; i++) {
		const word = strs[i];
		const key = word
			.split("")
			.sort()
			.join("");
		//key will be the sorted word, and will cound as a word grouo. id "aet" : eat, tea

		if (!group[key]) {
			//make new value, the sorted key, give it an empty array
			//make a new array for this group
			group[key] = [];
		}
		//add to the key array
		group[key].push(word);
	}
	return Object.values(group);
};
