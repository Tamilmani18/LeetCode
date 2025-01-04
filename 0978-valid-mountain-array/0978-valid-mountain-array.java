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

class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;
        int l = 0;
        int r = n - 1;
        while (l + 1 < n - 1 && arr[l] < arr[l + 1]) l++;
        while (r - 1 > 0 && arr[r] < arr[r - 1]) r--;
        return l == r;
    }
}
