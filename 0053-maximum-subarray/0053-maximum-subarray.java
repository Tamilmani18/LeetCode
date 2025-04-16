class Solution {
    
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        
        int maxSum = Integer.MIN_VALUE;
        
        for ( int i = 0; i < n; i++ ) {
            
            int currentSum = 0;
            
            for ( int j = i; j < n; j++ ) {
                currentSum += nums[j];
                maxSum = Math.max( currentSum, maxSum );
            }

        }
        
        return maxSum;
    
    }

}

class Solution {
    
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        
        int curSum = nums[0];

        int maxSum = nums[0];
        
        for ( int i = 1; i < n; i++ ) {
            
            curSum = Math.max( nums[i] , nums[i] + curSum );

            maxSum = Math.max( maxSum, curSum );
        }
        
        return maxSum;
    
    }

}
