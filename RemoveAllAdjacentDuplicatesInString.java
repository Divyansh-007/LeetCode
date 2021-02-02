class Solution {
    public String removeDuplicates(String S) {
       Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < S.length(); i++){
            if(stack.isEmpty()){
                stack.push(S.charAt(i));
                continue;
            }
            
            if(S.charAt(i) == stack.peek()){
                stack.pop();
                continue;
            }else{
                stack.push(S.charAt(i));
                continue;
            }
        }
        
        String ans = "";
        
        while(!stack.isEmpty()){
            ans = ans + stack.pop();
        }
        
        String output = "";
        
        for(int i = ans.length() - 1; i >= 0; i--){
            output = output + ans.charAt(i);
        }
        
        return output;
    }
}
