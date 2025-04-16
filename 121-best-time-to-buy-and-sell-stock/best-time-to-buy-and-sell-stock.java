
class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;

        if ( n <= 1 ) return 0;

        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int currProfit = prices[j] - prices[i];
                maxProfit = Math.max(currProfit, maxProfit);
            }
        }

        return maxProfit;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;

        if ( n <= 1 ) return 0;
        
        int maxProfit = 0;

        int left = 0;

        for ( int right = 1; right < n; right++) {
            
            if ( prices[right] > prices[left]) {
                maxProfit = Math.max(prices[right] - prices[left], maxProfit);
            }
            else{
                left = right;
            }
                        
        }

        return maxProfit;
    }
}
