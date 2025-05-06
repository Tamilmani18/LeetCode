// Brute Force Approach

// Use Queue & add all non zero elements from the array
// to the queue then add it to the array & fill remaining with zeroes.


// Optimized

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            if( nums[i] == 0 ) count++;
            else if( count > 0 ){
                int temp = nums[i];
                nums[i] = 0;
                nums[i-count] = temp;
            }
        }

    }
}
