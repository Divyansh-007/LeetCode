class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
                continue;
            }
            
            map.put(nums[i],1);
        }
        
        int ans = 0;
        Set<Integer> keys = map.keySet();
        for(int key : keys){
            if(map.get(key) >= 2){
                ans = key;
                break;
            }
        }
        
        return ans;
    }
}
