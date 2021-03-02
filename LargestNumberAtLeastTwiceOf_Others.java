class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxInd = 0;
        
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxInd = i;
            }
        }
        
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != max && max < 2 * nums[i]){
                return -1;
            }
        }
        
        return maxInd;
    }
}
