class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > maxValue) maxValue = i;
            if (i < minValue) minValue = i;
        }
        return (minValue + k >= maxValue - k) ? 0 : (maxValue - k) - (minValue + k);
    }
}