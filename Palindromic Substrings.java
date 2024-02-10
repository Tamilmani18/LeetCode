/*
Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.

Example 1:

Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:

Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

*/

class Solution {
    public int countSubstrings(String s) {
        int res = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            // Calculate counts for even and odd palindromes from the current character as the center
            int even = palindromeCount(s, i, i + 1);
            int odd = palindromeCount(s, i - 1, i + 1);

            // Update the result with the counts of even, odd, and 1 (for single character)
            res += even + odd + 1;
        }

        return res; 
    }
    public int palindromeCount(String word, int left, int right) {
        int count = 0; 
        // Expand the potential palindrome using a while loop
        while (left >= 0 && right < word.length() && word.charAt(left--) == word.charAt(right++)) {
            count++; // Increment count for each valid palindrome found
        }

        return count;
    }
}
