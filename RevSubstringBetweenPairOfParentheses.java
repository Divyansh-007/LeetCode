class Solution {
    public String reverseParentheses(String s) {
        if(s.length() == 0 || s.length() == 1){
            return s;
        }
        
        Stack<Character> st = new Stack();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ')'){
                st.push(ch);
                continue;
            }else{
                String curr = "";
                while(st.peek() != '('){
                    curr = curr + st.pop();
                }
                st.pop();
                for(int j = 0; j < curr.length(); j++){
                    st.push(curr.charAt(j));
                }
                continue;
            }
        }
        
        // reverse of required
        String ans = "";
        while(!st.isEmpty()){
            ans = ans + st.pop();
        }
        
        // required string
        String res = "";
        for(int i = ans.length() - 1; i >= 0; i--){
            res = res + ans.charAt(i);
        }
        
        return res;
    }
}
