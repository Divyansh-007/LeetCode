class Solution {
    public List<String> commonChars(String[] A) {
        List<String> ans = new ArrayList<>();
        int[] count = new int[26];
        Arrays.fill(count,Integer.MAX_VALUE);
        
        for(String str : A){
            int[] freq = new int[26];
            for(int i = 0; i < str.length(); i++){
                freq[str.charAt(i) - 'a']++;
            }
            
            for(int i = 0; i < 26; i++){
                count[i] = Math.min(count[i],freq[i]);
            }
        }
        
        for(char c = 'a'; c <= 'z'; c++){
            while(count[c - 'a'] > 0){
                ans.add("" + c);
                count[c - 'a']--;
            }
        }
        
        return ans;
    }
}
