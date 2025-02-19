class Solution {
    
    private static void dfs (int[] nums, List<List<Integer>> result, List<Integer> comb, int sum, int target, int start) {
        if (sum == target) {
            result.add(new ArrayList<>(comb));
            return;
        } else if (sum > target) {
            return;
        } else {
            for (int i = start; i < nums.length; i++) {
                comb.add(nums[i]);
                dfs(nums, result, comb, sum + nums[i], target, i);
                comb.remove(comb.size() - 1);
            }
        }
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        dfs(candidates, result, new ArrayList<>(), 0, target, 0);
        
        return result;
    }
}
// k -> height of the recursion tree or decision tree
// TC -> O(2^k * n)
// SC -> O(k)
