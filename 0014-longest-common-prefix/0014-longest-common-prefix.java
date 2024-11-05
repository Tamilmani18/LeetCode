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

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length -1 ];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i) != last.charAt(i)) return result.toString();
            result.append(first.charAt(i));
        }
        return result.toString();
    }
}
