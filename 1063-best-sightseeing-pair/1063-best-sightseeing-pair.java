class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int maxScore = Integer.MIN_VALUE;
        int bestScore = values[0];
        for (int i = 1; i < n; i++) {
            maxScore = Math.max(maxScore, bestScore + values[i] - i);
            bestScore = Math.max(bestScore, values[i] + i);
        }
        return maxScore;
    }
}
