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

class Solution {
    public int maximumValue(String[] strs) {
        int ans = 0;
        for(String str : strs){
            for(char c : str.toCharArray()){
                if(c >= 'a' && c <= 'z'){
                    ans = Math.max(ans, str.length());
                    break;
                }
                else{
                    try{
                        ans = Math.max(ans, Integer.parseInt(str));
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                }
            }
        }
        return ans;
    }
}
