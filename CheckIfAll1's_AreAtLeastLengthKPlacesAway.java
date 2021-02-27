class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prevInd = -1;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                if(prevInd == -1){
                    prevInd = i;
                    continue;
                }else{
                    if((i - prevInd - 1) < k){
                        return false;
                    }else{
                        prevInd = i;
                    }
                }
            }
        }
        
        return true;
    }
}
