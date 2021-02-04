class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length() != B.length()){
            return false;
        }
        
        if(A.equals(B)){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i = 0; i < A.length(); i++){
                if(map.containsKey(A.charAt(i))){
                    map.put(A.charAt(i),map.get(A.charAt(i)) + 1);
                    continue;
                }
                
                map.put(A.charAt(i),1);
            }
            
            return map.size() < A.length();
        }
        
        ArrayList<Integer> diff = new ArrayList<>();
        
        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) != B.charAt(i)){
                diff.add(i);
            }
        }
        
        return diff.size() == 2 && A.charAt(diff.get(0)) == B.charAt(diff.get(1)) && A.charAt(diff.get(1)) == B.charAt(diff.get(0));
        
    }
}
