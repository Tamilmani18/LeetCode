class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        // if the string has only 0 return 0
        if ( s.charAt(0) == '0' ) return 0;

        int[] dp = new int[ n+1 ];
        dp[n] = 1;

        for ( int i =  n-1; i >= 0; i-- ) {
            // base case if string has 0 insert 0 in table
            if ( s.charAt(i) == '0' ) dp[i] = 0;
            else {
                // if string can be converted 
                dp[i] = dp[ i+1 ];
                // starts at index n-1 because last index has no right values
                // the range is 1 to 26
                // if two digits can be decoded, if starting has 1 next number 
                // can be anything but if starting is 2 the next number should be 
                // less or equal to 6 
                if ( i < n-1 && ( s.charAt(i) == '1' || s.charAt(i) == '2' && 
                s.charAt(i + 1) <= '6') ) {
                    dp[i] += dp[i+2];
                }
            }
        }
        return dp[0];
    }
}

// 0 1 2
// 2 2 6