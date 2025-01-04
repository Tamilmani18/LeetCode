class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int e : nums1){
            set.add(e);
        }
        for (int e : nums2) {
            if (set.contains(e)) return e;
        }
        return -1;
    }
}

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int i = 0; i < nums1.length; i++){
            int j = 0;
            while( j < nums2.length && nums2[j] <= nums1[i] ){
                if ( nums1[i] == nums2[j] ) return nums1[i];
                j++;
            }
        }

        return -1;
    }
}
