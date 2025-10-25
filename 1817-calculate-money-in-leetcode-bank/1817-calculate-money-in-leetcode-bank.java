class Solution {
    public int totalMoney(int n) {
        int bank = 0;
        int money = 1;
        int count = 0;
        int reset = 1;
        while (n > 0) {
            bank += money;
            money++;
            count++;
            if (count >= 7) {
                money = ++reset;
                count = 0;
            }
            n--;
        }
        return bank;
    }
}