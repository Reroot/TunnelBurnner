package FireCode;

import java.util.Arrays;

/**
//You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its horizontal axis.
//
//Example:
//
//Input image :  
//              1 1
//              0 0
//Modified to :   
//              0 0
//              1 1
 */
public class horizontalFlip {
	public static void main(String[] args) {

		flipHorizontalAxis(new int[][] {{7,8,9},{4,5,6},{1,2,3}});
		flipHorizontalAxis(new int[][] {{1,0,1},{1,0,1}});
		flipHorizontalAxis(new int[][] {{0,0,1},{1,0,0}});
		flipHorizontalAxis(new int[][] {{1}});
		flipHorizontalAxis(new int[][] {{7,8,9},{4,5,6},{1,2,3}});

	}
	// record: fail but correct?
	public static void flipHorizontalAxis(int[][] matrix) {
	    int rows = matrix.length-1; //DO ROWS FIRST IN FOR LOOPS
	    int col = matrix[0].length-1;
	    for(int i = 0;i<=rows/2;i++) { //we need to reverse from top to bottom, halfway of the rows, but all the columbs,
	        for(int j = 0;j<=col;j++) {
	            int temp = matrix[i][j]; //this is the start, j is col, we will go through all so it will just inc, but rows will b row-j, inc 
	            matrix[i][j] = matrix[rows-i][j];
	            matrix[rows-i][j] = temp;
	        }
	    }
	    
        for (int[] r : matrix) {
            // converting each row as string 
            // and then printing in a separate line 
            System.out.println(Arrays.toString(r));

        }
	}



}
