class Solution {
    public void rev(char[] ch, int si, int ei){
        while(si < ei){
            char temp = ch[ei];
            ch[ei] = ch[si];
            ch[si] = temp;
            si++;
            ei--;
        }
    }
    
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' '){
                int j = i;
                
                while(j + 1 < ch.length && ch[j + 1] != ' '){ 
                    j++; 
                }
                rev(ch, i, j);
                i = j;
            }
        }
        
        return new String(ch);
    }
}
