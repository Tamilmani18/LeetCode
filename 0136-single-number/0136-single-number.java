class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums)
            result ^= num;
        return result;
    }
}

// T - O(n)
// S - O(1)
