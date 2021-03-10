class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[256];
        
        for(int i = 0 ; i < s.length(); i++){
            freq[s.charAt(i)]++;
        }
        
        int ans = 0;
        
        for(int c : freq){
            ans = ans + (c / 2 * 2);
            if(ans % 2 == 0 && c % 2 == 1){
                ans++;
            }
        }
        
        return ans;
    }
}
