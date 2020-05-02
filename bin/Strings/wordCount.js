// Title  : Word Count Engine
// Source : https://www.pramp.com/challenge/W5EJq2Jld3t2ny9jyZXG
// Author : Frank Faustino
// Date   : 2018-01-13

const wordCountEngine = (str) => {
	// Parse string for any punctuation and extra spaces
	// then split into an array
	const wordsArr = str
		.toLowerCase()
		.replace(/[':;,!?.]/g, "")
		.replace(/\s\s+/g, " ") // remove EXTRA SPACES
		.trim()
		.split(" ");
	//EX:
	//var str = '  A B  C   D EF ';
	// console.log(str.replace(/\s/g, '#'));  // ##A#B##C###D#EF#
	// console.log(str.replace(/\s+/g, '#')); // #A#B#C#D#EF#
	const obj = {};
	let output = [];
	// Store words and their corresponding occurrences in an object
	for (let word of wordsArr) {
		if (word in obj) obj[word]++;
		else obj[word] = 1; //key
	}
	// Sorting will count down from the length of wordsArr
	// (which is the maximum possible occurrence of a word)
	// If the stored occurrence value matches `i` push the word
	// and occurrence number to our output array
	for (let i = wordsArr.length; i > -1; i--) {
		for (let key in obj) {
			if (obj[key] === i) output.push([key, `${i}`]);
			//or `${i}`, or i, but {} allows for string conversion
			// var foo = 'bar';
			// console.log(`Let's meet at the ${foo}`);
			// // Let's meet at the bar
			//as i becomes less the lesster i are  pushed to the back
			//the highest ones will display first
			//       As mentioned in a comment above, you can have expressions within the template strings/literals. Example:

			// const one = 1;
			// const two = 2;
			// const result = `One add two is ${one + two}`;
			// console.log(result); // output: One add two is 3
		}
	}
	return output;
};

/* ——— Test cases ——— */
const doc1 =
	"Practice makes perfect. you'll only get Perfect by practice. just practice!";
const doc2 =
	"I have failed over and over and over again in my life and that is why I succeed.";
const doc3 =
	"Every book is a quotation; and every house is a quotation out of all forests, and mines, and stone quarries; and every man is a quotation from all his ancestors. ";
const doc4 = "To be, or not to be, that is the question:";
const doc5 =
	"Look If you had One shot, Or one opportunity, To seize everything you ever wanted, In one moment, Would you capture it, Or just let it slip?";
const doc6 =
	"Cause I'm Slim Shady, yes I'm the real Shady, All you other Slim Shadys are just imitating So won't the real Slim Shady, please stand up, Please stand up, Please stand up";

console.log(wordCountEngine(doc1)); // [["just","4"],["practice","3"],["perfect","2"],["makes","1"],["youll","1"],["get","1"],["by","1"]]
console.log(wordCountEngine(doc2)); // [["to","2"],["be","2"],["or","1"],["not","1"],["that","1"],["is","1"],["the","1"],["question","1"]]
console.log(wordCountEngine(doc3)); // [["and","4"],["every","3"],["is","3"],["a","3"],["quotation","3"],["all","2"],["book","1"],["house","1"],["out","1"],["of","1"],["forests","1"],["mines","1"],["stone","1"],["quarries","1"],["man","1"],["from","1"],["his","1"],["ancestors","1"]]
console.log(wordCountEngine(doc4)); // [["over","3"],["and","3"],["i","2"],["have","1"],["failed","1"],["again","1"],["in","1"],["my","1"],["life","1"],["that","1"],["is","1"],["why","1"],["succeed","1"]]
console.log(wordCountEngine(doc5)); // [["you","3"],["one","3"],["or","2"],["it","2"],["look","1"],["if","1"],["had","1"],["shot","1"],["opportunity","1"],["to","1"],["seize","1"],["everything","1"],["ever","1"],["wanted","1"],["in","1"],["moment","1"],["would","1"],["capture","1"],["just","1"],["let","1"],["slip","1"]]
console.log(wordCountEngine(doc6)); // [["slim","3"],["shady","3"],["please","3"],["stand","3"],["up","3"],["im","2"],["the","2"],["real","2"],["cause","1"],["yes","1"],["all","1"],["you","1"],["other","1"],["shadys","1"],["are","1"],["just","1"],["imitating","1"],["so","1"],["wont","1"]]

// Implement a document scanning function wordCountEngine, which receives a string document and returns a list of all unique words in it and their number of occurrences, sorted by the number of occurrences in a descending order. If two or more words have the same count, they should be sorted according to their order in the original sentence. Assume that all letters are in english alphabet. You function should be case-insensitive, so for instance, the words “Perfect” and “perfect” should be considered the same word.

// The engine should strip out punctuation (even in the middle of a word) and use whitespaces to separate words.

// Analyze the time and space complexities of your solution. Try to optimize for time while keeping a polynomial space complexity.

// Examples:

// input:  document = "Practice makes perfect. you'll only
//                     get Perfect by practice. just practice!"

// output: [ ["practice", "3"],
//            ["perfect", "2"],
//            ["makes", "1"],
//            ["youll", "1"],
//            ["only", "1"],
//           ["get", "1"], ["by", "1"], ["just", "1"] ]

// const wordCountEngine2 = function(str) {
// 	str = str.split(" ");
// 	let count = new Map();
// 	let countAtIndex = [];

// 	for (let i = 0; i < str.length; i++) {
// 		let word = str[i].replace(/\W/g, "").toLowerCase();
// 		count.set(word, count.get(word) + 1 || 1);
// 	}

// 	for (let [key, value] of count) {
// 		if (!countAtIndex[value]) {
// 			countAtIndex[value] = [];
// 		}
// 		countAtIndex[value].push([key, value]);
// 	}

// 	countAtIndex = countAtIndex.reverse();
// 	return countAtIndex.reduce((acc, el, i) => acc.concat(el), []);
// };

// let str =
// 	"Practice makes perfect. you'll only get Perfect by practice. just practice!";
// console.log(wordCountEngine(str));

// function wordCountEngine(document) {
// your code goes here
/*const lowDoc = document.toLowerCase().split();
    let docArr = doc.toLowerCase().replace(/[^a-z\s]/g, '').replace(/\s\s+/g, ' ').split(' ');
    
    const chars = [];
    for (let i = 0; i < lowDoc.length; i++) {
      if (lowDoc[i] <= 'z' && lowDoc[i] >= 'a' && lowDoc[i] == " ") {
        chars.push(lowDoc[i]);
      }
    }*/
// const lowDoc = document.toLowerCase();

// expression that removes anything that is NOT alpha numeric and a hyphen. So allowed are A-Z 0-9 and -.
//   var str = 'a23a-asd!@#$';
//   str.replace(/[^-a-z0-9]/ig,'');

//   const words = lowDoc.replace(/[^a-z\s]/g, '').replace(/\s\s+/g, ' ').split(' ');;

//   const hash = {};

//   words.forEach(w => {
//     if (hash[w]) {
//       hash[w]++;
//     } else {
//       hash[w] = 1;
//     }
//   });
//   // sorting
//   const preResult = Object.keys(hash).map(key => {key: key,count: hash[key].toString(),place:lowDoc.indexOf(key)]});

//   return result.sort((a,b)=>(a.place-b.place)).map(p=>[p.key,p.count]);
// }
