class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        // Append the first two elements
        arr1.add(nums[0]);
        if (nums.length > 1) {
            arr2.add(nums[1]);
        }

        for (int i = 2; i < nums.length; i++) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        // Convert List<Integer> to int[]
        int[] result = new int[arr1.size() + arr2.size()];
        for (int i = 0; i < arr1.size(); i++) {
            result[i] = arr1.get(i);
        }
        for (int i = 0; i < arr2.size(); i++) {
            result[arr1.size() + i] = arr2.get(i);
        }

        return result;
    }
}