class Solution {
    public boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < matrix[i].length; j++) {
                if (!set.contains(matrix[i][j])) set.add(matrix[i][j]);
                else return false;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < matrix.length; j++) {
                if (!set.contains(matrix[j][i])) set.add(matrix[j][i]);
                else return false;
            }
        }
        return true;
    }
}


class Solution {
    public boolean checkValid(int[][] matrix) {
        int len = matrix.length;
        for(int i=0; i<len; i++){
            HashSet<Integer> row = new HashSet<>();
            HashSet<Integer> column = new HashSet<>();
            for(int j=0; j<matrix.length; j++){
                row.add(matrix[i][j]);
                column.add(matrix[j][i]);
            }
            if(row.size() != len || column.size() != len) return false;
        }
        return true;
    }
}
