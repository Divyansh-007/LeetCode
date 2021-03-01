class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
    
        for(; k > 0; k--){
            
            int[][] ans = new int[m][n];
            
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n - 1; j++){
                    ans[i][j + 1] = grid[i][j];
                }
            }

            for(int i = 0; i < m - 1 ; i ++){
                ans[i + 1][0] = grid[i][n - 1];
            }

            ans[0][0] = grid[m - 1][n - 1];
            
            grid = ans;
        }
        
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i = 0 ; i < m; i++){
            List<Integer> curr = new ArrayList<>();
            for(int j = 0 ; j < n; j++){
                curr.add(grid[i][j]);
            }
            res.add(curr);
        }
        
        return res;
    }
}
