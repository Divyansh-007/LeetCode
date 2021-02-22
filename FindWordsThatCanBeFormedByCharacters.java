class Solution {
    
    public boolean isGood(String word, String str){
        int[] freq = new int[26];
        
        for(int i = 0 ; i < str.length(); i++){
            freq[str.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < word.length(); i++){
            freq[word.charAt(i) - 'a']--;
        }
        
        for(int i = 0; i < 26; i++){
            if(freq[i] < 0){
                return false;
            }
        }
        
        return true;
    }
    
    public int countCharacters(String[] words, String chars) {
        
        int ans = 0;
        
        for(String word : words){
            if(isGood(word,chars)){
                ans = ans + word.length();
            }
        }
        
        return ans;
    }
}
