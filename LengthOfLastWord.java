class Solution {
    public int lengthOfLastWord(String s) {
        char[] ch = s.toCharArray();
        int lastChInd = -1;
        int len = 0;
        for(int i = ch.length - 1; i >= 0; i--){
            if(ch[i] != ' '){
                lastChInd = i;
                break;
            }else{
                continue;
            }
        }
        
        if(lastChInd == -1){
            return 0;
        }
        
        for(int j = lastChInd; j >= 0; j--){
            if(ch[j] != ' '){
                len++;
            }else{
                break;
            }
        }
        
        return len;
    }
}
