class Solution {
    
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        
        if ( n == 1 ) return 1;

        int[] dp = new int[n];
        dp[0] = 1;
        
        int ans = 0;
        
        for ( int i = 1; i < n; i++ ) {
            
            int len = 0;
            
            for ( int j = 0; j < i; j++ ) {
                // Picking the elements which is less than the current element (i)
                if ( nums[j] < nums[i] ) {
                    // and the values are max
                    len = Math.max( len, dp[j] );

                }
            }
            dp[i] = len + 1;

            ans = Math.max( ans , dp[i] ); 
        }
        return ans;
    }
}
