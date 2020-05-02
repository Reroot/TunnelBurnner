// public class Solution {
//     public int uniquePaths(int m, int n) {
//         Integer[][] map = new Integer[m][n];
//         for(int i = 0; i<m;i++){
//             map[i][0] = 1;
//         }
//         for(int j= 0;j<n;j++){
//             map[0][j]=1;
//         }
//         for(int i = 1;i<m;i++){
//             for(int j = 1;j<n;j++){
//                 map[i][j] = map[i-1][j]+map[i][j-1];
//             }
//         }
//         return map[m-1][n-1];
//     }
// }
/**
 * @param {number} m
 * @param {number} n
 * @return {number}
 */
var uniquePaths = function(m, n) {
	//make a 2d array
	let arr = new Array(m);
	for (let x = 0; x < m; x++) {
		arr[x] = [];
	}

	for (let i = 0; i < m; i++) {
		arr[i][0] = 1;
	}
	for (let j = 0; j < n; j++) {
		arr[0][j] = 1;
	}
	//start at cordiate 1, 1
	for (let i = 1; i < m; i++) {
		for (let j = 1; j < n; j++) {
			arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
		}
	}
	return arr[m - 1][n - 1];
};
