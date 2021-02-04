class Solution {
    
    public String transform(String str, HashMap<Character,String> map){
        String ans = "";
        
        for(int i = 0; i < str.length(); i++){
            ans = ans + map.get(str.charAt(i));
        }
        
        return ans;
    }
    
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character, String> map = new HashMap<>();
        
        for(int i = 0; i < 26; i++){
            map.put((char)('a' + i),codes[i]);
        }
        
        HashMap<String,Boolean> transformMap = new HashMap<>();
        
        for(int i = 0; i < words.length; i++){
            String curr = transform(words[i],map);
            if(transformMap.containsKey(curr)){
                continue;
            }
            
            transformMap.put(curr,true);
        }
        
        for(int i = 0 ; i < words.length; i++){
            System.out.println(words[i] + "->" + transform(words[i],map));
        }
        
        return transformMap.size();
    }
}
