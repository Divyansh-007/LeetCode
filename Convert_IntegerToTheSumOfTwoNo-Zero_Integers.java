class Solution {
    
    public boolean nonZero(int n){
        if(n < 0){
            return false;
        }
        
        while(n > 0){
            if(n % 10 == 0){
                return false;
            }
            n = n / 10;
        }
        
        return true;
    }
    
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        
        for(int i = 1; i < n; i++){
            if(nonZero(i) && nonZero(n - i)){
                ans[0] = i;
                ans[1] = n - i;
                break;
            }
        }
        
        return ans;
    }
}
