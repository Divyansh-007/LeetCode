class Solution {
    
    public int expArdCent(String s, int left, int right){
        int l = left;
        int r = right;
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        
        return r - l - 1;
    }
    
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1){
            return "";
        }
        
        int si = 0;
        int ei = 0;
        
        for(int i = 0; i < s.length(); i++){
            int len1 = expArdCent(s, i, i);
            int len2 = expArdCent(s, i, i + 1);
            int len = Math.max(len1,len2);
            
            if(len > ei - si){
                si = i - (len - 1) / 2;
                ei = i + len / 2;
            }
        }
        
        return s.substring(si, ei + 1);
    }
}
