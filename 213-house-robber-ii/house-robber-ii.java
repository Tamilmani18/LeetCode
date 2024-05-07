class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if ( n == 1 ) return nums[0];
        if ( n == 2 ) return Math.max( nums[0] , nums[1] );
        return Math.max( robber( nums , 0, n-2 ) , robber( nums , 1 , n-1 ) );
    }

    private int robber(int[] nums, int start, int end) {
        
        int prev1 = nums[start]; 
        int prev2 = Math.max( nums[start] , nums[ start + 1] );

        for ( int i = start+2; i <= end; i++ ) {
            int current = Math.max( nums[i] + prev1 , prev2 );
            prev1 = prev2;
            prev2 = current;
        }
        return prev2;
    }
}