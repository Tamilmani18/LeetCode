class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);

        int n = people.length;
        
        int countOfBoats = 0;

        int i = 0;
        int j = n - 1;

        while (i <= j) {
            
            if (people[i] + people[j] <= limit) {
                i++;
            }
            
            j--;

            countOfBoats++;
        }

        return countOfBoats;
    }
}

// 1 2 2 3

// 3 3 4 5