class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int max = Integer.MIN_VALUE;
                if (matrix[i][j] == -1) {
                    for (int k = 0; k < matrix.length; k++) {
                        max = Math.max(max, matrix[k][j]);
                    }
                    matrix[i][j] = max;
                }
            }
        }
        return matrix;
    }
}

class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for (int c = 0; c < matrix[0].length; c++) {
            int maxVal = Integer.MIN_VALUE;
            for (int r = 0; r < matrix.length; r++) {
                maxVal = Math.max(maxVal, matrix[r][c]);
            }
            for (int r = 0; r < matrix.length; r++) {
                if (matrix[r][c] == -1) {
                    matrix[r][c] = maxVal;
                }
            }
        }
        return matrix;
    }
}
