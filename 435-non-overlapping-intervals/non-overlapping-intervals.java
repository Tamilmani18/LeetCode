class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        // Sorting based on end time of interval
        Arrays.sort(intervals,(a, b) -> a[1] - b[1]);

        int count = 1;

        int prev = 0;

        for (int curr = 1; curr < intervals.length; curr++) {
            int endTimeOfPrev = intervals[prev][1];
            int startTimeOfCurr = intervals[curr][0];
            if (endTimeOfPrev <= startTimeOfCurr) {
                count++;
                prev = curr;
            }
        }

        return intervals.length - count;
    }
}