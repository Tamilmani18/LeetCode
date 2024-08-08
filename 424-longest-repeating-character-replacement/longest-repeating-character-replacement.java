class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] frequency = new int[26];
        int maxLength = 0, maxF = 0;

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            
            maxF = Math.max(maxF, ++frequency[s.charAt(right) - 'A']);
            
            if (right - left + 1 - maxF > k) {
                frequency[s.charAt(left) - 'A']--;
                left++;
                maxF = findMaxFrq(frequency);
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public int findMaxFrq(int[] frq) {
        int max = 0;
        for (int n : frq) max = Math.max(max, n);
        return max;
    }
}