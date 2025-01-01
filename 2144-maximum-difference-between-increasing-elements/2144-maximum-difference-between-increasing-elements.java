class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int currDiff = nums[j] - nums[i];
                    maxDiff = Math.max(currDiff, maxDiff);
                }
            }
        }
        return maxDiff;
    }
}