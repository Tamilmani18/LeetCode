class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int[] arr = new int[2];
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(nums[mid]==target){
                int left = mid;
                while(left > 0 && nums[left-1]==target){
                    left--;
                }
                int right = mid;
                while(right<nums.length-1 && nums[right+1]==target){
                    right++;
                }
                arr[0]=left;
                arr[1]=right;
                return arr;
            }
            else if(target < nums[mid]){
                high = mid-1;
            }
            else if(target > nums[mid]){
                low = mid+1;
            }
        }
        arr[0]=-1;
        arr[1]=-1;
        return arr;
    }
}