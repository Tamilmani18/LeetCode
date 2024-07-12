class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int n = intervals.length;
        
        List<int[]> result = new ArrayList<>();

        int i = 0;
        
        // left non overLapping intervals of newInterval 
        while ( i < n && intervals[i][1] < newInterval[0] ) {
            result.add(intervals[i]);
            i++;
        }

        // startTime endTime of overLapping intervals
        while ( i < n && intervals[i][0] <= newInterval[1] ) {
            int startTime = Math.min(intervals[i][0], newInterval[0]);
            int endTime = Math.max(intervals[i][1], newInterval[1]);
            newInterval[0] = startTime;
            newInterval[1] = endTime;
            i++;
        }
        result.add(newInterval);

        // remaining intervals
        while ( i < n ) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][2]);
    }
}
