class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        for (int i = 0; i < mat.length; i++) {
            int soldiers = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) soldiers++;
                else break;
            }
            mat[i][0] = soldiers;
        }
        int[] result = new int[k];
        int j = 0;
        while (k > 0) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < mat.length; i++) {
                if (mat[i][0] < min) {
                    min = mat[i][0];
                    minIndex = i;
                }
            }
            mat[minIndex][0] = Integer.MAX_VALUE;
            result[j++] = minIndex;
            k--;
        }
        return result;
    }
}


class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] nums= new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            int n=0;
            for(int j=0;j<mat[i].length;j++){
                n=(mat[i][j]==1)? n+1:n;
            }
            nums[i][0]=n;
            nums[i][1]=i;
        }
        Arrays.sort(nums,(a,b)->a[0]-b[0]);
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=nums[i][1];
        }
        return result;
    }
}


class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);
        int[] ans = new int[k];
        
        for (int i = 0; i < mat.length; i++) {
            pq.offer(new int[] {numOnes(mat[i]), i});
            if (pq.size() > k)
                pq.poll();
        }
        
        while (k > 0)
            ans[--k] = pq.poll()[1];
        
        return ans;
    }
    
    private int numOnes(int[] row) {
        int lo = 0;
        int hi = row.length;
        
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            
            if (row[mid] == 1)
                lo = mid + 1;
            else
                hi = mid;
        }
        
        return lo;
    }
}
