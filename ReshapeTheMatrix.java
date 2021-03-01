class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length == 0 || (r * c) != nums.length * nums[0].length){
            return nums;
        }
        
        int[][] ans = new int[r][c];
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++){
                q.add(nums[i][j]);
            }
        }
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                ans[i][j] = q.poll();
            }
        }
        
        return ans;
    }
}
