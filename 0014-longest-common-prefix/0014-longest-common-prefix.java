class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String result = strs[0];
        for(int i=1;i<strs.length;i++){
            int j = 0;
            while( j < strs[i].length() && j < result.length() && strs[i].charAt(j) == result.charAt(j)){
                j++;
            }
            result = result.substring(0,j);
            if(result == null) break;
        }
        return result;
    }
}