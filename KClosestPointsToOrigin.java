class Solution {
    
    public int distance(int[] point){
        return point[0] * point[0] + point[1] * point[1];
    }
    
    public int[][] kClosest(int[][] points, int K) {
        int n = points.length;
        int[] dist = new int[n];
        
        for(int i = 0; i < n; i++){
            dist[i] = distance(points[i]);
        }
        
        Arrays.sort(dist);
        
        int kthDis = dist[K - 1];
        int[][] ans = new int[K][2];
        int ind = 0;
        
        for(int i = 0; i < n; i++){
            if(distance(points[i]) <= kthDis){
                ans[ind] = points[i];
                ind++;
            }
        }
        
        return ans;
    }
}
