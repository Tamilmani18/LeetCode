class Solution {
    
    private int covertToInteger(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return -1;
        }
    }
    
    public int maximumValue(String[] strs) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < strs.length; i++) {
            int currValue = covertToInteger(strs[i]);
            if (currValue == -1) currValue = strs[i].length();
            maxValue = Math.max(currValue, maxValue);
        }
        return maxValue;
    }
}