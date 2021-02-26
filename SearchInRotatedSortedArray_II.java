class Solution {
    
    public boolean searchHelp(int[] arr, int value){
        if(arr.length < 2){
            if(arr[0] != value){
                return false;
            }else{
                return true;
            }
        }
        
        int si = 0;
        int ei = arr.length - 1;
        
        while(si < ei){
            if(arr[si] == value){
                return true;
            }else if(arr[ei] == value){
                return true;
            }else{
                int mid = (si + ei) / 2;
                if(arr[mid] > value){
                    ei = mid - 1;
                }else if(arr[mid] < value){
                    si = mid + 1;
                }else{
                    return true;
                }    
            }
        }
        
        return false;
    }
    
    public boolean search(int[] nums, int target) {
        Arrays.sort(nums);
        return searchHelp(nums,target);
    }
}
