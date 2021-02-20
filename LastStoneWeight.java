class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        
        for(int elem : stones){
            pq.add(elem);
        }
        
        while(pq.size() > 1){
            pq.add(pq.poll() - pq.poll());
        }
        
        return pq.poll();
    }
}
