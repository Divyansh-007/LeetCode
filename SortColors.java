class Solution {
    public void sortColors(int[] nums) {
        int si = 0;
        int ei = nums.length - 1;
        int count2 = 0;
        
        while(si <= ei){
            if(nums[si] != 2){
                si++;
            }else{
                if(nums[ei] == 2){
                    count2++;
                    ei--;
                }else{
                    count2++;
                    int temp = nums[ei];
                    nums[ei] = nums[si];
                    nums[si] = temp;
                    ei--;
                }
            }
        }
        
        si = 0;
        ei = nums.length - count2 - 1;
        
        while(si < ei){
            if(nums[si] == 0){
                si++;
            }else{
                if(nums[ei] == 1){
                    ei--;
                }else{
                    int temp = nums[ei];
                    nums[ei] = nums[si];
                    nums[si] = temp;
                }
            }
        }
    }
}
