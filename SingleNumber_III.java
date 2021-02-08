class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int elem : nums){
            if(map.containsKey(elem)){
                map.put(elem,2);
                continue;
            }
            
            map.put(elem,1);
        }
        
        Set<Integer> keys = map.keySet();
        int[] ans = new int[2];
        int k = 0;
        
        for(int key : keys){
            if(map.get(key) == 1){
                ans[k] = key;
                k++;
            }
        }
        
        return ans;
    }
}
