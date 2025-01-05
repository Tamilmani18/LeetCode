class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        if (n <= 2) return nums;
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) even.add(nums[i]);
            if (i % 2 != 0) odd.add(nums[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) nums[i] = even.removeFirst();
            if (i % 2 != 0) nums[i] = odd.removeLast();
        }
        return nums;
    }
}