class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        // Find which string has minimum length
        int minLength = Math.min(word1.length(),word2.length());
        // Loop and add characters upto minimum length string
        for(int i=0;i<minLength;i++){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        // Append the remaining characters from the longer string
        result.append(word1.substring(minLength));
        result.append(word2.substring(minLength));
        return result.toString();
    }
}

// or 

    public static String mergeAlternately2(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while ( i < word1.length() || i < word2.length()) {
            if ( i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if ( i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
