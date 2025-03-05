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


class Solution {    

    public int oddCells(int m, int n, int[][] indices) {
        int[] rows=new int[m];
        int[] cols=new int[n];

        for(int[] arr:indices){
            rows[arr[0]]++;
            cols[arr[1]]++;
        }

        int row_count=0;
        int col_count=0;
        for(int i=0;i<m;i++){
            if(rows[i]%2!=0){
                row_count++;
            }
        }

        for(int i=0;i<n;i++){
            if(cols[i]%2!=0){
                col_count++;
            }
        }

        int ans=0;

        ans=(row_count*(n-col_count))+((m-row_count)*col_count);

        return ans;
    }
}
