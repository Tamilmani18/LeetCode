class Solution {
    public int getMaximumGenerated(int n) {
        int[] result = new int[n + 1];
        if (n == 0) return 0;
        if (n == 2 || n == 1) return 1;
        result[0] = 0;
        result[1] = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            if ((2 * i) <= n) result[(2 * i)] = result[i];
            if (((2 * i) + 1) <= n) result[(2 * i) + 1] = result[i] + result[i + 1];   
            max = Math.max(max, result[i]);
        }
        return max;
    }
}
