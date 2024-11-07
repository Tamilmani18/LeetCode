// Find the length of longest substring which has only k unique characters.


public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] map = new int[256];
        int cnt = 0, max = 0; 
        for (int i = 0, j = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map[c]++;
            if (map[c] == 1) cnt++;
            for (; cnt > k; j++) {
                c = s.charAt(j);
                map[c]--;
                if (map[c] == 0) cnt--; 
            }
            max = Math.max(max, i - j + 1); 
        }
        return max;
    }
