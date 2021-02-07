class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        
        List<Integer> ans = new ArrayList<>();
        
        int i = 0;
        while(i + 1 < nums.length){
            if(nums[i] == nums[i + 1]){
                ans.add(nums[i]);
                i = i + 2;
            }else{
                i++;
            }
        }
        
        return ans;
    }
}
