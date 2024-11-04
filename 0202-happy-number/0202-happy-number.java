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
            
        int slow = n;
        int fast = n;

        do {
            slow = calcSumOfSquareDigits(slow);
            fast = calcSumOfSquareDigits(calcSumOfSquareDigits(fast));
        } while (slow != fast);
        
        return slow == 1;
    }
 
}

// TC -> O(n)
// SC -> O(1)

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

// TC -> O(log n)
// SC -> O(n)
