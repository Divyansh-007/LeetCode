class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            map.put(nums[i],true);
        }
        
        Set<Integer> keys = map.keySet();
        int ans = 0;
        
        for(int i = 0; i <= n; i++){
            if(!keys.contains(i)){
                ans = i;
                break;
            }    
        }
        
        return ans;
    }
}
