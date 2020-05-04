package Matrix;

import java.util.ArrayList;

public class printPaths {
	public ArrayList<String> printPaths(char[][] board){
	    ArrayList<String> ar = new ArrayList<String>();
	    String s = "";
	    int row = board.length;
	    int col = board[0].length;
	    
	    for(int i = 0;i<row;i++) {
	        for(int j = 0;j<col;j++) {
	            //dfs, and sink
	            ar.add(dfs(board, i, j, s));
	        }
	    }
	    return ar;
	}

	private String dfs(char[][] m, int i, int j, String s) {
	    if(i < 0 || j < 0 || i > m[0].length || j > m.length) return s;

	    char temp = m[i][i];
	    m[i][i] ^= 256;
	    
	    dfs(m, i+1, j, s);//down on row
	    dfs(m, i, j+1, s);//right on col
	    if(temp == m[m.length-1][m[0].length-1]) {
	        s = s+(temp);
	    }
	    
	    m[i][i] ^= 256;
		return s;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
