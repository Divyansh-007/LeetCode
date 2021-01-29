class Solution {
    
    public int searchHelp(int[] arr, int target, int si, int ei){
        if(si > ei){
            return -1;
        }
        
        int mid = (si + ei) / 2;
        
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            return searchHelp(arr,target,si,mid - 1);
        }else{
            return searchHelp(arr,target,mid + 1,ei);
        }
    }
    
    public int search(int[] nums, int target) {
        return searchHelp(nums,target,0,nums.length - 1);
    }
}
