class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        
        for(int num : nums2){
            while(!st.isEmpty() && st.peek() < num){
                map.put(st.pop(),num);
            }
            
            st.push(num);
        }
        
        int[] ans = new int[nums1.length];
        
        for(int i = 0; i < nums1.length; i++){
            if(map.containsKey(nums1[i])){
                ans[i] = map.get(nums1[i]);
            }else{
                ans[i] = -1;
            }
        }
        
        return ans;
    }
}
