package Matrix;

import java.util.ArrayList;

public class printPaths {
	public ArrayList<String> printPaths(char[][] board){
	    ArrayList<String> ar = new ArrayList<String>();
	    String s = "";
	    int row = board.length-1;
	    int col = board[0].length-1;
	    
	    for(int i = 0;i<=row;i++) {
	        for(int j = 0;j<=col;j++) {
	            //dfs, and sink
	            dfs(board, i, j, s);
	            if(board[i][j] == board[row][col]) {
	               ar.add(s);
	               s = "";
	            } 
	            
	        }
	    }
	    return ar;
	}

	private void dfs(char[][] m, int i, int j, String s) {
	    if(i < 0 || j < 0 || j > m[0].length-1 || i > m.length-1) return;
	    s = s+(m[i][i]);
	    m[i][i] ^= 256;
	    dfs(m, i+1, j, s);//down on row
	    dfs(m, i, j+1, s);//right on col

	    m[i][i] ^= 256;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
