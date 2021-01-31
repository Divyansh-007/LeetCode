class Solution {
    public boolean isPerfectSquare(int num) {
        long si = 1;
        long ei = num;
        
        while(si <= ei){
            long mid = (si + ei) / 2;
            if(mid * mid == num){
                return true;
            }else if(mid * mid < num){
                si = mid + 1;
            }else{
                ei = mid - 1;
            }
        }
        return false;
    }
}
