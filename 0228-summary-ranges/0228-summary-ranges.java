class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0, j = 0, n = nums.length;
        while (j < n && i < n) {
            if (j+1 < n && nums[j + 1] == nums[j] + 1) {
                j++;
            } else if ((j - i) == 1) {
                result.add(nums[i] + "->" + nums[j]);
                i = j + 1;
                j++;
            } else if (j == i) {
                result.add(nums[i] + "");
                i++;
                j++;
            } else {
                result.add(nums[i] + "->" + nums[j]);
                i = j + 1;
                j++;
            }
        }
        return result;
    }
}