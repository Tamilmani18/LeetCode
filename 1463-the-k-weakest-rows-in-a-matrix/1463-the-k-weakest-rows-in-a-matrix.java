class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        for (int i = 0; i < mat.length; i++) {
            int soldiers = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) soldiers++;
                else break;
            }
            mat[i][0] = soldiers;
        }
        int[] result = new int[k];
        int j = 0;
        while (k > 0) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < mat.length; i++) {
                if (mat[i][0] < min) {
                    min = mat[i][0];
                    minIndex = i;
                }
            }
            mat[minIndex][0] = Integer.MAX_VALUE;
            result[j++] = minIndex;
            k--;
        }
        return result;
    }
}
