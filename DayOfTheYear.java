class Solution {
    
    public boolean isLeap(int year){
        if(year % 400 == 0){
            return true;
        }
        
        if(year % 100 == 0){
            return false;
        }
        
        if(year % 4 == 0){
            return true;
        }
        
        return false;
    }
    
    public int dayOfYear(String date) {
        String[] str = date.split("-");
        int y = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int d = Integer.parseInt(str[2]);
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int ans = 0;
        boolean leap = isLeap(y);
        
        for(int i = 0; i < m - 1; i++){
            if(leap == true && i == 1){
                ans = ans + days[i] + 1;
                continue;
            }
            
            ans = ans + days[i];
        }
        
        return ans + d;
    }
}
