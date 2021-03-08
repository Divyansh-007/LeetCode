class Solution {
    public int trap(int[] height) {
        if(height == null){
            return 0;
        }
        
        int total = 0;
        int curr = 0;
        int i = 0;
        Stack<Integer> st = new Stack<>();
        
        while(i < height.length){
            if(st.isEmpty() || height[i] <= height[st.peek()]){
                st.push(i++);
            }else{
                int top = st.pop();
                if(st.isEmpty()){
                    curr = 0;
                }else{
                    curr = (Math.min(height[st.peek()],height[i]) - height[top]) * (i - st.peek() - 1);
                }
                total = total + curr;
            }
        }
        
        return total;
    }
}
