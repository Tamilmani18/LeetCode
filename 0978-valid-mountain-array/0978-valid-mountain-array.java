class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) return false;
        }
        int topIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) topIndex = i;
            else break;
        }
        if (topIndex == arr.length - 1 || topIndex == 0) return false;
        for (int i = topIndex + 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) return false;
        }
        return true;
    }
}