class Solution {
    
    // Bottom Up DP Approach

    public int climbStairs(int n) {
        
        if ( n <= 2 ) return n;

        int[] dp = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for ( int i = 3; i <= n; i++ ) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }   
}

/*
Computing next step based on previous two steps
*/
