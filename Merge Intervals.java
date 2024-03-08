
/*
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 

Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104

*/

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals,(int[] a , int[] b)->Integer.compare(a[0],b[0]));

        List<int[]> mergedIntervals = new ArrayList<>();

        int intervalStart = intervals[0][0];
        int intervalEnd = intervals[0][1];

        for( int i = 1; i < n; i++){

            if ( intervals[i][0] > intervalEnd ){
                mergedIntervals.add(new int[] {intervalStart , intervalEnd});
                intervalStart = intervals[i][0];
                intervalEnd = intervals[i][1];
            } else {
                intervalEnd = Math.max(intervalEnd , intervals[i][1]);
            }
        }
        mergedIntervals.add( new int[] {intervalStart , intervalEnd} );

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
