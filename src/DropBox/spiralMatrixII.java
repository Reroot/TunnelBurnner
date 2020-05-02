package DropBox;
// Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

// Example:

// Input: 3
// Output:
// [
//  [ 1, 2, 3 ],
//  [ 8, 9, 4 ],
//  [ 7, 6, 5 ]
// ]
//help
class spiralMatrixII {
	public int[][] spiralMatrixII(int n) {
	    int[][] res = new int[n][n];
	    int curCounter = 1;
	    int rowBegin = 0;
	    int rowEnd = n - 1;
	    int colBegin = 0;
	    int colEnd = n - 1;
	    
	    while(curCounter <= n * n) {
	            int i = rowBegin;
	            int j = colBegin;
	            //left to right
	            for(j = colBegin ; j <= colEnd; j++){
	                res[rowBegin][j] = curCounter++;
	            }
	            rowBegin++;
	            //top to bot
	            for(i = rowBegin ; i <= rowEnd; i++){
	                res[i][colEnd] = curCounter++;
	            }
	            colEnd--;
	            //right to left
	            for(j = colEnd ; j >= colBegin; j--){
	                res[rowEnd][j] = curCounter++;
	            }
	            rowEnd--;
	            //bot to top
	            for(i = rowEnd; i >= rowBegin; i--){
	                res[i][colBegin] = curCounter++;
	            }
	            colBegin++;
	    }
	    return res;
	}
}




//self try one
// class Solution {
//     public int[][] generateMatrix(int n) {
        //make a empty matrix that's nxn
        //itheraite thorough the matrix assigining every value
        //as we iteraite in a spiral
        //start at 0,0
        //top left to top right -> end at matrix[].length of first col
        //top right to down right - > row-(same) col --
        //down right to down left - > row, col--
        // complete, but now we need to go inwards from corner
        // subtract both --row and --col to go in or ++row, ++col
//         int [][] matrix = new int[n][n];
//         int count = 1;
//         for(int row = 0;row < matrix.length-1;row++) {
//             for(int col = 0;col< matrix[0].length-1;col++) {
//                 //LEFT TO RIGHT

//                 //could work if we log out starts and corners
//                 addFromRange(matrix, row, n++);//right
//                 addFromRange(matrix, n--, col);//down
//                 addFromRange(matrix, row, n--);//left
//                 addFromRange(matrix, n--, col);//up
//             }
//         }
//     }
// }
