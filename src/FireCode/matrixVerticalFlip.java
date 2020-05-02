package FireCode;

public class matrixVerticalFlip {

	public static void flipItVerticalAxis(int[][] matrix) {
	    int rows = matrix.length-1;
	    int col = matrix[0].length-1;
	    
	    for(int i = 0;i<=rows;i++) {
	        for(int j = 0;j<=col/2;j++) {
	            //we are taking a col and flipping it, only need half of the col
	            int temp = matrix[i][j];
	            matrix[i][j] = matrix[i][col-j];//col end
	            matrix[i][col-j] = temp;
	        }// col [][][][-] from right to left, sub col halfway, rows are just top to bottom all
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
