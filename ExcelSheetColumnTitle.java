class Solution {
    public String convertToTitle(int n) {
        String ans = "";
        
        while(n > 0){
            ans = (char)('A' + ((n - 1) % 26)) + ans;
            n = (n - 1) / 26;
        }
        
        return ans;
    }
}
