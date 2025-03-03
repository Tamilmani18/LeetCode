class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        a = arr[0];
        b = arr[1];
        c = arr[2];
        int minMoves;
        if ((a + 1 == b) && (b + 1 == c) ) {
            minMoves = 0;
        }
        else if ((b - a - 1) > 1 && (c - b - 1) > 1) {
            minMoves = 2;
        }
        else {
            minMoves = 1;
        }
        int maxMoves = (b - a - 1) + (c - b - 1);
        return new int[] {minMoves, maxMoves};
    }
}