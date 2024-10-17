class Solution {
    public int arrangeCoins(int n) {
        
        int coins = n;
        int row = 1;
        int count = 0;
        
        while (coins >= row) {
            coins = coins - row;
            row++;
            count++;
        }
        
        return count;
    }
}