class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        
        int si = 0;
        int ei = nums.length - 1;
        
        if(nums[ei] > nums[0]){
            return nums[0];
        }
        
        while(si <= ei){
            int mid = (si + ei) / 2;
            
            if(nums[mid] > nums[mid + 1]){
                return nums[mid + 1];    
            }
            
            if(nums[mid - 1] > nums[mid]){
                return nums[mid];
            }
            
            if(nums[mid] > nums[0]){
                si = mid + 1;
            }else{
                ei = mid - 1;
            }
        }
        
        return -1;
    }
}
