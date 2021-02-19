class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String str : words){
            if(map.containsKey(str)){
                map.put(str,map.get(str) + 1);
                continue;
            }
            
            map.put(str,1);
        }
        
        PriorityQueue<String> pq = new PriorityQueue<String>((w1,w2) -> map.get(w1).equals(map.get(w2)) ? w2.compareTo(w1) : map.get(w1) - map.get(w2));
        
        Set<String> keys = map.keySet();
        
        for(String key : keys){
            pq.add(key);
            if(pq.size() > k){
                pq.poll();
            }
        }
        
        List<String> ans = new ArrayList<>();
        
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}
