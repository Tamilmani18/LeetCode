class Solution {
    public void setZeroes(int[][] matrix) {
        boolean hasFirstRow = false;
        boolean hasFirstCol = false;

        // First Row
        for (int c = 0; c < matrix[0].length; c++) {
            if (matrix[0][c] == 0) {
                hasFirstRow = true;
                break;
            }
        }

        // First Column
        for (int r = 0; r < matrix.length; r++) {
            if (matrix[r][0] == 0) {
                hasFirstCol = true;
                break;
            }
        }

        // Preprocessing
        for (int r = 1; r < matrix.length; r++) {
            for (int c = 1; c < matrix[0].length; c++) {
                if (matrix[r][c] == 0) {
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }

        // 1st row
        for (int c = 1; c < matrix[0].length; c++) {
            if (matrix[0][c] == 0) {
                nullifyCol(matrix, c);
            }
        }

        // 1st column
        for (int r = 1; r < matrix.length; r++) {
            if (matrix[r][0] == 0) {
                nullifyRow(matrix, r);
            }
        }

        if (hasFirstRow) nullifyRow(matrix, 0);
        if (hasFirstCol) nullifyCol(matrix, 0);
        
    }

    public void nullifyRow(int[][] matrix, int row) {
        for (int c = 0; c < matrix[0].length; c++) {
            matrix[row][c] = 0;
        }
    }

    public void nullifyCol(int[][] matrix, int col) {
        for (int r = 0; r < matrix.length; r++) {
            matrix[r][col] = 0;
        }
    }
}