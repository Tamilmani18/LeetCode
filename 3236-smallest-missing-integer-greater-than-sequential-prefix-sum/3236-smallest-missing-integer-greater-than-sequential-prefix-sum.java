class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            set.add(i);
            max = Math.max(max, i);
        }
        int prefixSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == (nums[i - 1] + 1)) {
                prefixSum += nums[i];
            } else {
                break;
            }
        }

        if (!set.contains(prefixSum)) return prefixSum;

        for (int i = prefixSum; i <= max; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return max + 1;
    }
}