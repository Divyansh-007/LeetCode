class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num) + 1);
                continue;
            }
            
            map.put(num,1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) != map.get(b) ? map.get(b) - map.get(a) : a - b);
        
        Set<Integer> keys = map.keySet();
        
        for(int key : keys){
            pq.add(key);
        }
        
        int[] ans = new int[nums.length];
        int n = ans.length;
        
        while(n > 0){
            int curr = pq.poll();
            int freq = map.get(curr);
            
            while(freq-- > 0){
                ans[--n] = curr;
            }
            
        }
        
        return ans;
    }
}
