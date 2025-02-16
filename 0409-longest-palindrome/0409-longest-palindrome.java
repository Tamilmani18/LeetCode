class Solution {
    
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        int maxLen = 0;
        boolean hasOdd = false;
        for (int count : freq.values()) {
            if (count % 2 == 0) {
                maxLen += count;
            } else {
                maxLen += count - 1;
                hasOdd = true;
            }
        }
        return hasOdd ? maxLen + 1 : maxLen;
    }
}
