class Solution {
    
    int[][] dp;
    String text1 , text2;
    
    private int solve(int i, int j) {
        if ( i >= text1.length() || j >= text2.length() ) return 0;
        if ( dp[i][j] != -1 ) return dp[i][j]; 
        int ans;
        if ( text1.charAt(i) == text2.charAt(j) ) {
           ans = 1 + solve(i+1 , j+1);
        }else {
            ans = Math.max(solve(i , j+1) , solve(i+1 , j));
        }
        return dp[i][j] = ans;
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        this.text1 = text1;
        this.text2 = text2;
        dp = new int[n][m];
        for ( int[] row : dp ){
            Arrays.fill(row , -1);
        }
        return solve(0 , 0);
    }
}