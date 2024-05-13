class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] grid = new int[m][n];
        grid[0][0] = 1;
        
        // first row
        for ( int i = 1; i < grid[0].length; i++ ) {
            grid[0][i] = 1;
        }
        
        // first column
        for ( int i = 1; i < grid.length; i++ ) {
            grid[i][0] = 1;
        }

        for ( int row = 1; row < grid.length; row++ ) {
            // filling current row so column upto current row length
            for ( int column = 1; column < grid[0].length; column++ ) {
                int top = grid[row-1][column];
                int left = grid[row][column-1];
                grid[row][column] = top + left;
            }
        }
        
        return grid[m-1][n-1];
    }
}