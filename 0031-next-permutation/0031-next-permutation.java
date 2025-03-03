class Solution {
    
    private void reverseArray(int[] arr, int si, int ei) {
        while (si < ei) {
            swapElement(arr, si, ei);
            si++;
            ei--;
        }
    }

    private void swapElement(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void nextPermutation(int[] nums) {
        int idx = -1, n = nums.length;
        
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        
        if (idx == -1) {
            reverseArray(nums, 0, n - 1);
            return;
        }
        
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swapElement(nums, i, idx);
                break;
            }
        }

        reverseArray(nums, idx + 1, n - 1);
    }
}
