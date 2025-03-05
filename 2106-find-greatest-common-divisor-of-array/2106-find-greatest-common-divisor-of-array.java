class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        while (min > 0 && max > 0) {
            if (max > min) max = max % min;
            else min = min % max;
        }

        return max == 0 ? min : max;
    }
}