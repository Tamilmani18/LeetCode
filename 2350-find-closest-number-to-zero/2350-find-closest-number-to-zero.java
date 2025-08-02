class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int closestToZero = Integer.MAX_VALUE;
        int actualNum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int distance = Math.abs(nums[i]);
            if (distance <= closestToZero) {
                closestToZero = distance;
                actualNum = nums[i];
            }
        }
        closestToZero = actualNum;
        return closestToZero;
    }
}
