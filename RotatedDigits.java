class Solution {
    
    public boolean isValid(int n){
        boolean valid = false;
        
        while(n > 0){
            if(n % 10 == 3 || n % 10 == 4 || n % 10 == 7){
                return false;
            }else if(n % 10 == 2 || n % 10 == 5 || n % 10 == 6 || n % 10 == 9){
                valid = true;
            }
            
            n = n / 10;
        }
        
        return valid;
    }
    
    public int rotatedDigits(int N) {
        int count = 0;
        for(int i = 1; i <= N; i++){
            if(isValid(i)){
                count++;
            }
        }
        
        return count;
    }
}
