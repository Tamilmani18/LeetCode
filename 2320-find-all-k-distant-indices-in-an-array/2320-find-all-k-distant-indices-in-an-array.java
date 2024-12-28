class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> keyIndex = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                keyIndex.add(i);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int j = 0;
            while (!keyIndex.isEmpty()) {
                int val;
                if (j < keyIndex.size()) {
                    val = i - keyIndex.get(j++);
                } else break;
                val = val < 0 ? val * -1 : val;
                if (val <= k) {
                    result.add(i);
                    break;
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}