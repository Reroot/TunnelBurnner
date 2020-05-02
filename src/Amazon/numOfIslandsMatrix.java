package Amazon;
//https://www.geeksforgeeks.org/amazon-interview-experience-sde-1-feb-2020-exp-1-5-yr/?ref=leftbar-rightbar
public class numOfIslandsMatrix {
    private static int row;
    private static int col;
    
    public int numIslands(char[][] matrix) {
        row = matrix.length-1;
        if(row == 0) return 0;
		col = matrix[0].length-1;
        if(col == 0) return 0;

		//the outer boundary is excluded so use > and <, and start at 1

		int count = 0;
		for(int i = 1;i<=row;i++) {
			for(int j = 1;j<=col;j++) {
				if(matrix[i][j] == '1') {
					//use dfs, means we go all the way down the path 
					dfs(i, j, matrix);//location and matrix
					count++;//calls to dfs will be the amout of times of the entire matrix
					//so it will jump out when it's done and inc the count; 
				}

			}
		}
		return count;
    }
    
    
    	private static void dfs(int i, int j, char[][] matrix) {
		if(i < 0 || j < 0 || i >= row || j >= col || matrix[i][j] != '1') return;
            //spit out we are out of our boundaries
		matrix[i][j] = '0';//sink
		//done regardless
		dfs(i + 1 , j, matrix); //right
		dfs(i - 1 , j, matrix); //left
		dfs(i , j + 1, matrix); // up
		dfs(i , j - 1, matrix); //down
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
