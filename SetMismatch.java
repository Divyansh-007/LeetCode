class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
                continue;
            }
            
            map.put(nums[i],1);
        }
        
        int[] ans = new int[2];
        
        Set<Integer> keys = map.keySet();
        
        for(int key : keys){
            if(map.get(key) == 2){
                ans[0] = key;
                break;
            }
        }
        
        for(int i = 1; i <= nums.length; i++){
            if(!keys.contains(i)){
                ans[1] = i;
                break;
            }
        }
        
        return ans;
    }
}
