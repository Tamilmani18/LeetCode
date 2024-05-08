class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;
        
        int reachable = 0;
        
        for ( int i = 0; i < n && i <= reachable; i++ ) {
            
            reachable = Math.max(reachable,i+nums[i]);
            
            if ( reachable >= nums.length - 1 ) return true;
        }

        return false;
    }
}