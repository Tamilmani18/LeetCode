class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int rightShift = 0;
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (count == 1) rightShift++;
            if (nums.get(i) > nums.get((i + 1) % nums.size())) count++;
            if (count > 1) return -1;
        }
        return rightShift;
    }
}