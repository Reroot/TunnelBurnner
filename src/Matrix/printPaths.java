package Matrix;

import java.util.ArrayList;

public class printPaths {
	//TRY 15mins, fail compliation
	public ArrayList<String> printPaths1(char[][] board){
	    int row = board.length;
	    int col = board[0].length;
	    ArrayList<String> al = new ArrayList<String>();
	    String path = "";
	    for(int i = 0;i<row;i++) {
	        for(int j = 0;j <col;j++) {
	            dfs(i, j, board, al, path);
	        }
	    }
	    return al;
	}

	public void dfs(int r, int c, char[][] board, ArrayList<String> al, String path) {
	    if(r < 0 || r > board.length-1 || c < 0 || c > board[0].length-1) return;//spit out as we are out of bounds
	    if(board[r][c] == board[board[0].length-1][board.length-1]) {
	        //add to al
	        al.add(path);
	        //reset path to 0
	        path = "";
	    }	    
	    
	    path = path + board[r][c];
	    board[r][c] ^= 256;//MARK AND KEEP IN MIND WHAT WE HAVE ALREADY TRAVERSSED
	    dfs(r, c-1, board, al, path);//down
	    dfs(r+1, c, board, al, path);//right
	    board[r][c] ^= 256;//ONCE WEVE USED UP UP AND DOWN< WE CAN UNMARK, AND CONTUINE AS RESTORE THE PATH
	}
	
	
	
	
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
