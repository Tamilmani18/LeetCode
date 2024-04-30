class Solution {
    
    // Fibonacci series Approach with constant SC

    public int climbStairs(int n) {
        
        if ( n <= 2 ) return n;

        int first = 1 , second = 2;

        for ( int i = 1; i <= n-2; i++ ) {

            int temp = first + second;
            
            first = second;

            second = temp; 
        
        }

        return second;
    }
    
}
