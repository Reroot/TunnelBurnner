function mostCommonWord(inputString) {
	let wordsCounter = {};
	let mostCommonCounter = 0;
	let mostCommonWord = "";
	inputString.split(" ").forEach((word) => {
		wordsCounter[word] = wordsCounter[word] || 0;
		wordsCounter[word]++;
		console.log(wordsCounter);
	});
	Object.keys(wordsCounter).forEach((word) => {
		if (wordsCounter[word] > mostCommonCounter) {
			mostCommonWord = word;
			mostCommonCounter = wordsCounter[word];
		}
	});
	return mostCommonWord;
}
console.log(mostCommonWord("hat hat now cat"));

//https://medium.com/appsflyer/unlocking-the-javascript-code-interview-an-interviewer-perspective-f4fe06246b29
