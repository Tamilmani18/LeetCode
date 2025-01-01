class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int operations = 0;
        int indexOfOne = 0;
        int indexOfN = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) indexOfOne = i;
            if (nums[i] == n) indexOfN = i;
        }
        if (indexOfOne < indexOfN) operations = indexOfOne + (n - indexOfN - 1);
        else operations =  indexOfOne + (n - indexOfN - 1) - 1; 

        return operations; 
    }
}