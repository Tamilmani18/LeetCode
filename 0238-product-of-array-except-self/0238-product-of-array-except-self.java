class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;

        int[] answer = new int[n];
        
        for ( int i = 0; i < n; i++ ) {
            
            int left = i-1;
            
            int right = i+1;

            int product = 1;

            while ( right < n ) {
                product *= nums[right];
                right++;
            }

            while ( left >= 0 ) {
                product *= nums[left];
                left--;
            }
            
            answer[i] = product;
        }

        return answer;

    }
}

class Solution {
    
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;

        int[] prefixProduct = new int[n];

        prefixProduct[0] = 1;
        
        for ( int i = 1; i < n; i++ ) {
            prefixProduct[i] = prefixProduct[i-1] * nums[i-1];
        }

        int[] suffixProduct = new int[n];

        suffixProduct[n-1] = 1;
        
        for ( int i = n-2; i >= 0; i-- ) {
            suffixProduct[i] = suffixProduct[i+1] * nums[i+1];
        }

        int[] answer = new int[n];

        for ( int i = 0; i < n; i++){
            answer[i] = prefixProduct[i] * suffixProduct[i];
        }

        return answer;

    }

}


class Solution {
    
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;

        int[] prefixProduct = new int[n];

        prefixProduct[0] = 1;
        
        for ( int i = 1; i < n; i++ ) {
            prefixProduct[i] = prefixProduct[i-1] * nums[i-1];
        }

        int suffixProduct = 1;
        
        for ( int i = n-1; i >= 0; i-- ) {
            
            prefixProduct[i] = prefixProduct[i] * suffixProduct;

            suffixProduct = suffixProduct * nums[i];

        }

        return prefixProduct;

    }

}
