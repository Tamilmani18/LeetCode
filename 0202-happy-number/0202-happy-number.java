class Solution {

    private int calcSumOfSquareDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    
    public boolean isHappy(int n) {
            
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = calcSumOfSquareDigits(n);
        }
        
        return n == 1;
    }
 
}