class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length()-1, j = b.length()-1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int digit1 = (i >= 0) ? a.charAt(i) : 0;
            int digit2 = (j >= 0) ? b.charAt(j) : 0;
            digit1 = digit1 - '0';
            digit2 = digit2 - '0';
            if (digit1 < 0) digit1 = 0;
            if (digit2 < 0) digit2 = 0;
            if (digit1 + digit2 + carry == 0) {
                result.append(0);
                carry = 0;
            } else if (digit1 + digit2 + carry == 1) {
                result.append(1);
                carry = 0;
            } else if (digit1 + digit2 + carry == 2) {
                result.append(0);
                carry = 1;
            } else {
                result.append(1);
                carry = 1;
            }
            i--;
            j--;
        }
        if (carry == 1) result.append(1);
        result.reverse();
        return result.toString();
    }
}

