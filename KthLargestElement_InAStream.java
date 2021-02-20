class KthLargest {
    
    PriorityQueue<Integer> pq;
    int k;

        public KthLargest(int k, int[] a) {
            this.k = k;
            pq = new PriorityQueue<>();
            
            for (int n : a){
                add(n);
            }
        }

        public int add(int n) {
            
            if (pq.size() < k){
                pq.add(n);
            }else if (pq.peek() < n) {
                pq.poll();
                pq.add(n);
            }
            
            return pq.peek();
        }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
