class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        
        int maximumProduct = Integer.MIN_VALUE;
        
        for( int i = 0; i < n; i++ ) {
            
            int currentProduct = 1;
            
            for( int j = i; j < n; j++ ) {
                
                currentProduct *= nums[j]; 
                
                maximumProduct = Math.max( maximumProduct,currentProduct );
            }
        
        }
        return maximumProduct;
    }
}

class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        
        int ans = nums[0];

        int min = 1 , max = 1;
        
        for( int i = 0; i < n; i++ ) {
            // handling 0s
            if ( nums[i] == 0 ) {
                min = 1;
                max = 1;
                ans = Math.max( ans , 0 );
            } else {

                int temp = min;

                // handling negative values to get next max
                min = Math.min( nums[i], Math.min( nums[i]*min , nums[i]*max ) );

                max = Math.max( nums[i], Math.max( nums[i]*temp , nums[i]*max ) );

                ans = Math.max( ans , max );
                
            }
        
        }

        return ans;
        
    }
}
