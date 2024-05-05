class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
       
       if ( text1.length() < text2.length() ){
            String temp = text1;
            text1 = text2;
            text2 = temp;
       }
       
       int n = text1.length() , m = text2.length();
       
       int[] prevDp = new int[m+1];
       int[] dp = new int[m+1];

        for ( int i = n-1; i >= 0; i-- ) {
            for ( int j = m-1; j >= 0; j-- ) {
                if ( text1.charAt(i) == text2.charAt(j) ) {
                    dp[j] = 1 + prevDp[j+1];
                }else {
                    dp[j] = Math.max(prevDp[j],dp[j+1]);
                }
            }
            prevDp  = dp.clone();
        }
        return dp[0];
    }
}
