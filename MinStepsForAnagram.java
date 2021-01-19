class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int step=0;
    
        //store everything of s into a hashmap, along with each frequencies
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
    
    
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);

            //if the map contains one of the character with at least 1 frequency,
            //we subtract the frequency
            
            if(map.containsKey(c) && map.get(c)>0){
                map.put(c, map.get(c)-1);
            }
            
            //otherwise increment the steps needed to make t anagram
            else step++;
        }
    
        return step;
    }
}
