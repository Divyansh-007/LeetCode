class Solution {
    public int titleToNumber(String s) {
        if(s == null){
            return -1;
        }
        
        int ans = 0;
        
        for(char ch : s.toCharArray()){
            ans = ans * 26;
            ans = ans + ((ch - 'A') + 1);
        }
        
        return ans;
    }
}
