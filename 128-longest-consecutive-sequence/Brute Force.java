
class Solution {
    public int longestConsecutive(int[] nums) {

        if ( nums.length == 0 ) return 0;
        
        TreeSet<Integer> tree = new TreeSet<>();

        for (int num : nums) {
            tree.add(num);
        }

        int count = 0;
        int maxCount = Integer.MIN_VALUE;

        ArrayList<Integer> arr = new ArrayList<>(tree);

        System.out.println(arr);

        for ( int i = 0; i < arr.size()-1; i++ ) {
            if ( arr.get(i) == (arr.get(i+1))-1  ) {
                count++;
            }else {
                maxCount = Math.max( count, maxCount );
                count = 0;
            }
        }

        return Math.max(count,maxCount)+1;
    }
}
