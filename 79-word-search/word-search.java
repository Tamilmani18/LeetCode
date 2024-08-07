class Solution {
    
    public boolean dfs(char[][] board, String word, int r, int c, int curr) {
        
        if (curr == word.length()) return true;

        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == '#') return false; 

        char ch = board[r][c];

        if (word.charAt(curr) != ch) return false;

        board[r][c] = '#';

        boolean top = dfs(board, word, r - 1, c, curr + 1); // top
        boolean right = dfs(board, word, r, c + 1, curr + 1); // right
        boolean bottom = dfs(board, word, r + 1, c, curr + 1); // bottom
        boolean left = dfs(board, word, r, c - 1, curr + 1); // left
        
        board[r][c] = ch;

        return top || right || bottom || left;
    }
    
    public boolean exist(char[][] board, String word) {
        
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (dfs(board, word, r, c, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
// TC : O(RC * 4^RC)
// SC : O(L)
