// Find the length of longest substring which has only k unique characters.


    private static int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < s.length(); i++) {
            map.clear();
            for (int j = i; j < s.length(); j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1 );
                if (map.size() <= k) {
                    max = Math.max(max, (j - i) + 1);
                } else {
                    break;
                }
            }
        }
        return max;
    }

// TC -> O(n2)
// SC -> O(n)

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
