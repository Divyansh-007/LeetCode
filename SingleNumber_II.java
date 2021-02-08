class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int elem : nums){
            if(map.containsKey(elem)){
                map.put(elem,map.get(elem) + 1);
                continue;
            }
            
            map.put(elem,1);
        }
        
        Set<Integer> keys = map.keySet();
        int ans = 0;
        
        for(int key : keys){
            if(map.get(key) == 1){
                ans = key;
            }
        }
        
        return ans;
    }
}
