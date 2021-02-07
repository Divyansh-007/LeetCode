class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] ch = s.toCharArray();
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '('){
                st.push(i);
            }
            
            if(ch[i] == ')'){
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    ch[i] = '*';
                }
            }
        }
        
        while(!st.isEmpty()){
            ch[st.pop()] = '*';
        }
        
        String ans = "";
        
        for(char c : ch){
            if(c == '*'){
                continue;
            }else{
                ans = ans + c;    
            }
        }
        
        return ans;
    }
}
