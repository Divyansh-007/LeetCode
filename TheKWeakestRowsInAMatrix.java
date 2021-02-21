class Solution {
    public int numOnes(int[] row) {
        int si = 0;
        int ei = row.length;
        
        while (si < ei) {
            int mid = si + (ei - si) / 2;
            
            if (row[mid] == 1)
                si = mid + 1;
            else
                ei = mid;
        }
        
        return si;
    }
    
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);
        
        int[] ans = new int[k];
        
        for (int i = 0; i < mat.length; i++) {
            pq.add(new int[] {numOnes(mat[i]), i});
            
            if (pq.size() > k){
                pq.poll();
            }
        }
        
        while (k > 0){
            ans[k - 1] = pq.poll()[1];
            k--;
        }
            
        return ans;
    }
}
