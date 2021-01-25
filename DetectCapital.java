class Solution {
    public boolean detectCapitalUse(String word) {
        int capCount = 0;
        int smallCount = 0;
        
        for(int i = 0 ; i < word.length(); i++){
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90){
                capCount++;
            }else{
                smallCount++;
            }
        }
        
        if(capCount == word.length()){
            return true;
        }else if(smallCount == word.length()){
            return true;
        }else{
            if(capCount == 1 && (word.charAt(0) >= 65 && word.charAt(0) <= 90)){
                return true;
            }
        }
        
        return false;
    }
}
