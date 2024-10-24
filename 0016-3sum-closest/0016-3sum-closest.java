class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int closest_sum = INT_MAX / 2;  // A large value but not overflow
        
        for (int i = 0; i < nums.size() - 2; ++i) {
            for (int j = i + 1; j < nums.size() - 1; ++j) {
                for (int k = j + 1; k < nums.size(); ++k) {
                    int current_sum = nums[i] + nums[j] + nums[k];
                    if (abs(current_sum - target) < abs(closest_sum - target)) {
                        closest_sum = current_sum;
                    }
                }
            }
        }
        
        return closest_sum;
    }
};

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums); // -1 2 1 -4

        int closestSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target))
                    closestSum = currentSum;

                if (currentSum < target)
                    left++;

                else if (currentSum > target)
                    right--;
                
                else
                    return currentSum;
            
            }
        }

        return closestSum;
    }
}
