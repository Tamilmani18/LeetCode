class Solution {
    public int lengthOfLastWord(String s) {
            String[] words = s.trim().split("\\s+");
            if(words.length == 0) return 0;
	        String lastWord = words[words.length-1];
	        return lastWord.length();
    }
}

// Optimized

class Solution {
    public int lengthOfLastWord(String s) {
        int right = s.length() - 1;
        while (right >= 0 && s.charAt(right) == ' ') {
            right--;
        }
        int left = right;
        while (left >= 0 && s.charAt(left) != ' ') {
            left--;
        }
        return right - left;
    }
}
