class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        
        int[][] dp = new int[m + 1][n + 1];
        
        dp[m][n] = 0;
        
        for(int j = n - 1; j >= 0; j--){
            dp[m][j] = dp[m][j + 1] + 1; 
        }
        
        for(int i = m - 1; i >= 0; i--){
            dp[i][n] = dp[i + 1][n] + 1;
        }
        
        for(int i = dp.length - 2; i >= 0; i--){
            for(int j = dp[0].length - 2; j >= 0; j--){
                int ans;
                
                if(word1.charAt(i) == word2.charAt(j)){
                    ans = dp[i + 1][j + 1];
                }else{
                    int op1 = dp[i + 1][j];
                    int op2 = dp[i][j + 1];
                    
                    ans = 1 + Math.min(op1,op2);
                }
                
                dp[i][j] = ans;
            }
        }
        
        return dp[0][0];
    }
}
