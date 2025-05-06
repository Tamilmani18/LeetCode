// Brute Force Approach

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        if (n == 1) return;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                queue.add(nums[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (!queue.isEmpty()) {
                nums[i] = queue.poll();
            }
            else {
                nums[i] = 0;
            }
        }
    }
}

// Optimized

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if (n == 1) return;
        int left = 0;
        for(int right = 0; right < n; right++){
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }
        for (int i = left; i < n; i++) {
            nums[i] = 0;
        }
    }
}

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
