class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else{
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                    continue;
                }else{
                    st.push(ch);
                }
            }
        }
        
        return st.size();
    }
}
