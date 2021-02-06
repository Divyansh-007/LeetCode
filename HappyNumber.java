class Solution {
    
    public int sqSumOfDig(int n){
        int sum = 0;
        
        while(n > 0){
            sum = sum + (int)(Math.pow((n % 10),2));
            n = n / 10;
        }
        
        return sum;
    }
    
    public boolean isHappy(int n) {
        if(n<10) {
		    if(n==1||n==7){
              return true;  
            }else{
                return false;
            } 
	    }
        
        int nextNum = sqSumOfDig(n);
	    return isHappy(nextNum);
    }
}
