class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        int[] count = new int[limit + 1];

        for (int p : people) count[p]++;

        int idx = 0;

        for (int val = 1; val <= limit; val++) {
            while (count[val]-- > 0) {
                people[idx++] = val;
            }
        }

        int n = people.length;
        
        int countOfBoats = 0;

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            }
            else {
                right--;
            }
            countOfBoats++;
        }

        return countOfBoats;
    }
}