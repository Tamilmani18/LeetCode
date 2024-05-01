// TC : O ( n * amount )
// SC : O ( amount )

class Solution {
    
    public int coinChange(int[] coins, int amount) {
        
        int[] dp = new int[amount + 1];

        for ( int i = 1; i <= amount; i++ ) {
            
            int min = Integer.MAX_VALUE;

            for ( int j = 0; j < coins.length; j++ ) {

                if ( i >= coins[j] && dp[i - coins[j]] != -1 ) {

                    min = Math.min( min, dp[i - coins[j]] );
                
                }
            }
            
            dp[i] = ( min == Integer.MAX_VALUE ) ? -1 : min + 1;
        }
        
        return dp[amount];

    }
}

/*

For every amount from from 1 to n given amount we are computing the minimum remaining coins
for every amount we are iterating through every coins which is <= amount not > amount
and finding the remaining coins by subtracting the amount with coins and picking the min of already precomputed no of coins from dp
and finally adding 1 for cuurent picked amount with min no of coins .

*/
