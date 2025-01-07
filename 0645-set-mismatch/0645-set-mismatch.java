class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>(); 
        int duplicate = 0;
        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            if (freq.get(nums[i]) > 1) duplicate = nums[i];
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!freq.containsKey(i)) {
                return new int[] {duplicate, i};
            }
        }
        return new int[] {-1, -1}; 
    }
}