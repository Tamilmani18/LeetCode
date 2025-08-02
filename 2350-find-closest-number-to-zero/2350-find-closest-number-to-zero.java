// Complexity

// Time complexity: O(n log n)

// Space complexity:O(1)

class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int closestToZero = Integer.MAX_VALUE;
        int actualNum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int distance = Math.abs(nums[i]);
            if (distance <= closestToZero) {
                closestToZero = distance;
                actualNum = nums[i];
            }
        }
        closestToZero = actualNum;
        return closestToZero;
    }
}

// Complexity

// Time complexity: O(n)

// Space complexity:O(1)


class Solution {
    public int findClosestNumber(int[] nums) {
        int minSoFar = Integer.MAX_VALUE;
        int actualValue = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int absVal = Math.abs(nums[i]);
            if (absVal < minSoFar) {
                minSoFar = absVal;
                actualValue = nums[i];
            } else if (nums[i] == minSoFar) {
                actualValue = minSoFar;
            }
        }
        return actualValue;
    }
}



