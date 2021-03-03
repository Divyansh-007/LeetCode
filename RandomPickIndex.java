class Solution {
    
    private HashMap<Integer,List<Integer>> map;
    private Random rand;

    public Solution(int[] nums) {
        this.rand = new Random();
        this.map = new HashMap<Integer,List<Integer>>();
        
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(!this.map.containsKey(nums[i])){
                List<Integer> curr = new ArrayList<>();
                curr.add(i);
                this.map.put(nums[i],curr);
                continue;
            }
            
            this.map.get(nums[i]).add(i);
        }
    }
    
    public int pick(int target) {
        int n = map.get(target).size();
        
        int randomInd = map.get(target).get(rand.nextInt(n));
        return randomInd;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
