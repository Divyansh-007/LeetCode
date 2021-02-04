class Solution {
    public int mapper(char sym){
        int value = 0;
        if(sym == 'I'){
            value = 1;
        }else if(sym == 'V'){
            value = 5;
        }else if(sym == 'X'){
            value = 10;
        }else if(sym == 'L'){
            value = 50;
        }else if(sym == 'C'){
            value = 100;
        }else if(sym == 'D'){
            value = 500;
        }else if(sym == 'M'){
            value = 1000;
        }
        
        return value;
    }
    public int romanToInt(String s) {
        if(s.length() == 1){
            return mapper(s.charAt(0));
        }
        
        int ans = 0;
        // char ch = s.charAt(s.length() - 1);
        // int currVal = mapper(ch);
        // int rem = romanToInt(s.substring(0,s.length() - 1));
        int currVal = 0;
        int rem = 0;
        char ch = s.charAt(s.length() - 1);
        if((ch == 'V' || ch == 'X') && s.charAt(s.length() - 2) == 'I'){
            currVal = mapper(ch) - 1;
            if(s.substring(0,s.length() - 2).length() == 0){
                return currVal;
            }
            rem = romanToInt(s.substring(0,s.length() - 2));
        }else if((ch == 'L' || ch == 'C') && s.charAt(s.length() - 2) == 'X'){
            currVal = mapper(ch) - 10;
            if(s.substring(0,s.length() - 2).length() == 0){
                return currVal;
            }
            rem = romanToInt(s.substring(0,s.length() - 2));
        }else if((ch == 'D' || ch == 'M') && s.charAt(s.length() - 2) == 'C'){
            currVal = mapper(ch) - 100;
            if(s.substring(0,s.length() - 2).length() == 0){
                return currVal;
            }
            rem = romanToInt(s.substring(0,s.length() - 2));
        }else{
            currVal = mapper(ch);
            rem = romanToInt(s.substring(0,s.length() - 1));
        }
        
        if(rem >= currVal){
            ans = rem + currVal;
        }else{
            ans = currVal - rem;    
        }
        
        return ans;
    }
}
