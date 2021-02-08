class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int elem : nums){
            if(map.containsKey(elem)){
                map.put(elem, map.get(elem) + 1);
                continue;
            }
            
            map.put(elem,1);
        }
        
        Set<Integer> keys = map.keySet();
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        
        for(int key : keys){
            if(map.get(key) > n / 3){
                ans.add(key);
            }
        }
        
        return ans;
    }
}
