class Solution {
    
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxIminusJmultiplyK = 0, maxI = 0, maxIminusJ = 0;
        for (int i = 0; i < n; i++) {
            maxIminusJmultiplyK = Math.max(maxIminusJmultiplyK, maxIminusJ * nums[i]); 
            maxIminusJ = Math.max(maxIminusJ, maxI - nums[i]);
            maxI = Math.max(maxI, nums[i]);
        }
        return maxIminusJmultiplyK;
    }
}