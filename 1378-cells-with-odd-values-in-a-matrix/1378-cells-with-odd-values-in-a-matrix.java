class Solution {
    public void incrementMatrix(int[][] arr, int r, int c) {
        for (int i = 0; i < arr[r].length; i++) {
            arr[r][i]++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i][c]++;
        }
    }
    

    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            incrementMatrix(arr, indices[i][0], indices[i][1]);
        }
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0) oddCount++;
            }
        }
        return oddCount;
    }
}