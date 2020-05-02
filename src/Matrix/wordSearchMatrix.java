package Matrix;

public class wordSearchMatrix {
    public boolean exist(char[][] board, String word) {
        //hashmap, iter matrix, grab letter, grab count--run though keyset and check for maching count, ,exist if all letter pass as exists, and count is at equal or greater.
        //use bfs, instead and count or break as we iterate
        char[] wchars = word.toCharArray();
        int i = 0;
        for(int rows=0;rows<matrix.length;rows++) {
           for(int col = 0;col<matrix[0].length;col++) {
               if(w[i] == matrix[col][row]) {
                   dfs(matrix, row, col, i);
               } else {
                   i++;
               }
           } 
        }
    }
    
    public static void dfs(int[][] m, int row, int col, int i, char[] s) {
        if(row > 0 || col > 0 || row > matrix.length || col > matrix[0].length || matrix[row][col] != s[i]) return false; 
    }
}
