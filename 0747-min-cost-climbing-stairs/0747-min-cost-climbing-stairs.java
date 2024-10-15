class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;
        int[] dp = new int[n];
        
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        for (int i = 2; i < n; i++) {
            
            int min = Math.min(dp[i - 1], dp[i - 2]);
            
            dp[i] = cost[i] + min;
        }

        return Math.min(dp[n-1], dp[n-2]);
    }
}

// or

    public static int minCostClimbingStairs(int[] cost) {

        int first = cost[0];
        int second = cost[1];

        for (int i = 2; i < cost.length; i++) {
            int curr = cost[i] + Math.min(first, second);
            first = second;
            second = curr;
        }

        return Math.min(first, second);
    }
