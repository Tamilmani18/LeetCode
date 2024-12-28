class Solution {
    
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long maxValue = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    long currVal = (long) (nums[i] - nums[j]) * nums[k];
                    maxValue = Math.max(currVal, maxValue);
                }
            }
        }
        return maxValue < 0 ? 0 : maxValue;
    }
}


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
