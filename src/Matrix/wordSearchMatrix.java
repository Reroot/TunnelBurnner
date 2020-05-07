package Matrix;

public class wordSearchMatrix {
	public boolean exist2(char[][] board, String word) {
	    char[] w = word.toCharArray();
	    for (int y=0; y<board.length; y++) {
	    	for (int x=0; x<board[y].length; x++) {
	    		if (exist(board, y, x, w, 0)) return true;
	    	}
	    }
	    return false;
	}

	private boolean exist(char[][] board, int y, int x, char[] word, int i) {
		if (i == word.length) return true;
		if (y<0 || x<0 || y == board.length || x == board[y].length) return false;
		if (board[y][x] != word[i]) return false;
		board[y][x] ^= 256;
		boolean exist = exist(board, y, x+1, word, i+1)
			|| exist(board, y, x-1, word, i+1)
			|| exist(board, y+1, x, word, i+1)
			|| exist(board, y-1, x, word, i+1);
		board[y][x] ^= 256;
		return exist;
	}
	
	
    public boolean existbad(char[][] board, String word) {
        //hashmap, iter matrix, grab letter, grab count--run though keyset and check for maching count, ,exist if all letter pass as exists, and count is at equal or greater.
        //use bfs, instead and count or break as we iterate
        char[] wchars = word.toCharArray();
        int i = 0;
        for(int rows=0;rows<word.length();rows++) {
           for(int col = 0;col<word[0].length;col++) {
               if(w[i] == word[col][row]) {
                   dfs(word, row, col, i);
               } else {
                   i++;
               }
           } 
        }
    }
    
    public static void dfs(int[][] m, int row, int col, int i, char[] s) {
        if(row > 0 || col > 0 || row > word.length || col > word[0].length || word[row][col] != s[i]) return false; 
    }
}
