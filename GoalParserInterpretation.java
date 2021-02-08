class Solution {
    public String interpret(String command) {
        String ans = "";
        Stack<Character> s = new Stack();
        
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                ans = ans + 'G';
                continue;
            }
            if(command.charAt(i) != ')'){
                s.push(command.charAt(i));
                continue;
            }else{
                int count = 0;
                while(s.peek() != '('){
                    count++;
                    s.pop();
                }
                
                if(count == 0){
                    ans = ans + 'o';
                    continue;
                }else{
                    ans = ans + 'a' + 'l';
                    s.pop();
                    continue;
                }
            }
        }
        
        return ans;
    }
}
