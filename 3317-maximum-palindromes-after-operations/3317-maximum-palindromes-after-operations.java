class Solution {
    public int maxPalindromesAfterOperations(String[] words) {
        int n = words.length;
        int[] wordLength = new int[n];
        for (int i = 0; i < n; i++) {
            wordLength[i] = words[i].length();
        }
        Arrays.sort(wordLength);
        Map<Character, Integer> freq = new HashMap<>();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }
        int pairs = 0;
        for (Map.Entry<Character, Integer> key : freq.entrySet()) {
            pairs += key.getValue() / 2;
        }
        for (int i = 0; i < n; i++) {
            pairs -= wordLength[i] / 2;
            if (pairs < 0) return i;
        }
        return n;
    }
}