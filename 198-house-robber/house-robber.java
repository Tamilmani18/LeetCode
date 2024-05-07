class Solution {
    public int rob(int[] nums) {
       
       // if only one house return that money in the house
       if ( nums.length == 1 ) return nums[0];

       int[] dp = new int[nums.length + 1];
       // choosing either first or second house
       dp[0] = nums[0]; 
       // Maximum of first house and second house in second house 
       dp[1] = Math.max( nums[0] , nums[1] ); 

       for ( int i = 2; i < nums.length; i++ ) {
            // if we rob the current house 
            int rob = nums[i] + dp[ i-2 ];
            // if we do not rob the current house
            int notRob = dp[ i-1 ];
            // maximum of if we robbed or not robbed current house
            dp[i] = Math.max( rob , notRob );
       }
       return dp[nums.length-1];
    }
}