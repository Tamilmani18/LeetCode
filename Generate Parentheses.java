Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]

// Back Tracking
  
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> output_arr = new ArrayList();
        backtrack(output_arr,"",0,0,n);
        return output_arr;
    }

    public void backtrack(List<String> output_arr,String current_String,int open,int close,int max){
        if(current_String.length() == max*2){
            output_arr.add(current_String);
            return;
        }

        if(open<max){
            backtrack(output_arr,current_String+"(",open+1,close,max);
        }

        if(close<open){
            backtrack(output_arr,current_String+")",open,close+1,max);
        }
    }
}
