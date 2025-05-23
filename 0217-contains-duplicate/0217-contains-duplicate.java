
// Sorting & Checking adjacent elements -> O(n log n)
// Nested For loop -> O(n2)

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
            	return true;
            map.put(nums[i], 1);
        }
        
        return false;
    }
}

// TC -> O(n)
// SC -> O(n)
