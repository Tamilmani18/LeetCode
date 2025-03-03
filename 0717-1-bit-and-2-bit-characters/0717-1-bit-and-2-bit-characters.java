class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0, n = bits.length;
        while (i < n - 1) {
            if (bits[i] == 0) i++;
            if (bits[i] == 1) i += 2;
        }
        return (i == n - 1) ? true : false;

    }
}

// 110 true
// 000 true
// 010 false
// 111 false
