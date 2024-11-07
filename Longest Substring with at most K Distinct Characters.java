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

    private static int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }

// TC -> O(n + n)
// SC -> O(n)
