class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int r = ransomNote.length();
        int m = magazine.length();
        
        if(r > m){
            return false;
        }
        
        int[] count = new int[26];
        
        for(int i = 0; i < m; i++){
            count[magazine.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < r; i++){
            count[ransomNote.charAt(i) - 'a']--;
        }
        
        for(int i = 0; i < 26; i++){
            if(count[i] < 0){
                return false;
            }
        }
        
        return true;
    }
}
