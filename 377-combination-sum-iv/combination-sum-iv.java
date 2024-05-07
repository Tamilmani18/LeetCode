class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        int[] dp = new int[target + 1];
        // base case for 0, combination is 1
        dp[0] = 1; 

        // for every target 1 to n(target), iterating through nums array 
        for ( int i = 1; i <= target; i++ ) {
            
            for ( int num : nums ) {
                // picking numbers which is <= target from nums array
                if ( num <= i ) { 
                    dp[i] += dp[ i - num ]; // dp[i] + dp[target - picked number]
                } 
            }
        }
        return dp[target];
    }
}
