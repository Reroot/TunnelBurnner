//python
// def num_of_paths_to_dest(n):
//     # Create a 2D table to store
//     # results of subproblems
//     count = [[0 for x in range(n)] for y in range(n)]

//     # Count of paths to reach any
//     # cell in first column is 1
//     for i in range(n):
//         count[i][0] = 1;

//     for j in range(n):
//         count[0][j] = 1;

//     # Calculate count of paths for other
//     # cells in bottom-up
//     # manner using the recursive solution
//     for i in range(1, n):
//         for j in range(n):
//             count[i][j] = count[i-1][j] + count[i][j-1]
//     return count[n-1][n-1]-1
