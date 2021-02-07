class Solution {
    public int calculate(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        int currNum = 0;
        char oper = '+';
        
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            
            if(Character.isDigit(ch)){
                currNum = currNum * 10 + (ch - '0');
            }
            
            if(!Character.isDigit(ch) && !Character.isWhitespace(ch) || i == n - 1){
                if(oper == '-'){
                    st.push(-currNum);
                }else if(oper == '+'){
                    st.push(currNum);
                }else if(oper == '*'){
                    st.push(st.pop() * currNum);
                }else{
                    st.push(st.pop() / currNum);
                }
                oper = ch;
                currNum = 0;
            }
        }
        
        int ans = 0;
        
        while(!st.isEmpty()){
            ans += st.pop();
        }
        
        return ans;
    }
}
