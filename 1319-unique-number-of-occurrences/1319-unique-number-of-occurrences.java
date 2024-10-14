class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }
        
        Set<Integer> set = new HashSet<>();
        
        for (int el : map.values()) {
            if (set.contains(el)) {
                return false;
            } else {
                set.add(el);
            }
        }
        return true;
    }
}