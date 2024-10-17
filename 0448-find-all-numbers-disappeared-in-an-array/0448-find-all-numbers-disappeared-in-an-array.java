class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        
        int n = nums.length;
        int index;

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                index = nums[i] * -1;
            } else {
                index = nums[i];
            }

            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
