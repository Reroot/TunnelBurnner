package DropBox;
class bestWayToSearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        //rxc if (target is < matrix[row][matrix[0].length-1])
        //search the row, else row ++
        //do it again
        if(matrix == null || matrix.length < 1 || matrix[0].length <1) {
            return false;
        }
        int col = matrix[0].length-1;
        int row = 0;
        while(col >= 0 && row<matrix.length) {
            if(target == matrix[row][col]) {
                    return true;
                } else if(target < matrix[row][col]) {
                    col--;
                } else {
                    row++;
        }
        }
        return false;
    }
}