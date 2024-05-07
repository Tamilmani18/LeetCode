class Solution {
    public int rob(int[] nums) {
       
       // if only one house return that money in the house
       if ( nums.length == 1 ) return nums[0];

       // choosing first house
       int prev1 = nums[0]; 
       // In second house choosing Maximum of first house and second house
       int prev2 = Math.max( nums[0] , nums[1] ); 

       for ( int i = 2; i < nums.length; i++ ) {
            
            // maximum of if we robbed or not robbed current house
            int current =  Math.max( nums[i] + prev1 , prev2 );
    
            prev1 = prev2;
            prev2 = current;
        }
        
       return prev2;
    }
}
