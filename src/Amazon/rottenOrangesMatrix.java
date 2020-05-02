package Amazon;

import java.util.LinkedList;
import java.util.Queue;

public class rottenOrangesMatrix {//NOT ATEMPTED SOLO
//	Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.
//	Return the minimum number of minutes that must elapse until no cell has 
//	a fresh orange.  
//	If this is impossible, return -1 instead.
////
//
//
//	Input:  arr[][C] = { {2, 1, 0, 2, 1},
//	                     {1, 0, 1, 2, 1},
//	                     {1, 0, 0, 2, 1}};
//	Output:
//	All oranges can become rotten in 2 time frames.
//
//
//	Input:  arr[][C] = { {2, 1, 0, 2, 1},
//	                     {0, 0, 1, 2, 1},
//	                     {1, 0, 0, 2, 1}};
//	Output:
//	All oranges cannot be rotten.
	public int orangesRotting(int[][] grid) {
		        if(grid == null || grid.length == 0) return 0;
		        int rows = grid.length;
		        int cols = grid[0].length;
		        Queue<int[]> queue = new LinkedList<>();
		        int count_fresh = 0;
		        //Put the position of all rotten oranges in queue
		        //count the number of fresh oranges
		        for(int i = 0 ; i < rows ; i++) {
		            for(int j = 0 ; j < cols ; j++) {
		                if(grid[i][j] == 2) {
		                    queue.offer(new int[]{i , j});
		                }
		                else if(grid[i][j] == 1) {
		                    count_fresh++;
		                }
		            }
		        }
		        //if count of fresh oranges is zero --> return 0 
		        if(count_fresh == 0) return 0;
		        int subCount = 0;
		        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
		        //bfs starting from initially rotten oranges
		        while(!queue.isEmpty()) {
		            ++subCount;
		            int size = queue.size();
		            for(int i = 0 ; i < size ; i++) {
		                int[] point = queue.poll();
		                for(int dir[] : dirs) {
		                    int x = point[0] + dir[0];
		                    int y = point[1] + dir[1];
		                    //if x or y is out of bound
		                    //or the orange at (x , y) is already rotten
		                    //or the cell at (x , y) is empty
		                        //we do nothing
		                    if(x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 || grid[x][y] == 2) continue;
		                    //mark the orange at (x , y) as rotten
		                    grid[x][y] = 2;
		                    //put the new rotten orange at (x , y) in queue
		                    queue.offer(new int[]{x , y});
		                    //decrease the count of fresh oranges by 1
		                    count_fresh--;
		                }
		            }
		        }
		        return count_fresh == 0 ? subCount-1 : -1;
	}
//	Imagine you are doing BFS on a tree, starting from depth = 0, you do depth++ every level as you go down, adding child nodes into the queue, and when you reach the last level where all the nodes are null(for instance) you are 
//			still doing depth++. But essentially nulls are not required so you just do 
//				depth - 1 in the end and return. I hope you understood.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
