class Solution {
    public String thousandSeparator(int n) {
        if(n == 0){
            return "0";
        }
        
        String ans = "";
        int count = 0;
        
        while(n > 0){
            ans = (n % 10) + ans;
            n = n / 10;
            count++;
            if(count < 3){
                continue;
            }else{
                if(n > 0){
                    ans = '.' + ans;    
                    count = 0;
                }
            }
        }
        
        return ans;
    }
}
