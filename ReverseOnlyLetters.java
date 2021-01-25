class Solution {
    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int si = 0;
        int ei = chars.length - 1;
        
        while(si < ei){
            if(!Character.isLetter(chars[si])){
                si++;
            }else if(!Character.isLetter(chars[ei])){
                ei--;
            }else{
                char temp = chars[ei];
                chars[ei] = chars[si];
                chars[si] = temp;
                si++;
                ei--;
            }
        }
        
        return new String(chars);
    }
}
