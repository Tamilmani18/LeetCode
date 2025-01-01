class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums2) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : nums1) {
            if (map.containsKey(i) && map.get(i) > 0) {
                arr.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] result = new int[arr.size()];
        int index = 0;
        for (int i : arr) {
            result[index++] = i;
        }
        return result;
    }
}