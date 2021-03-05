class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max = Integer.MIN_VALUE;
        
        int[] rb = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n - 1);
        rb[n - 1] = n;
        
        for(int i = n - 2; i >= 0; i--){
            while(st.size() > 0 && heights[i] <= heights[st.peek()]){
                st.pop();
            }
            
            if(st.isEmpty()){
                rb[i] = n;
            }else{
                rb[i] = st.peek();
            }
            st.push(i);
        }
        
        int[] lb = new int[n];
        st = new Stack<>();
        st.push(0);
        lb[0] = -1;
        
        for(int i = 1; i < n; i++){
            while(st.size() > 0 && heights[i] <= heights[st.peek()]){
                st.pop();
            }
            
            if(st.isEmpty()){
                lb[i] = -1;
            }else{
                lb[i] = st.peek();
            }
            st.push(i);
        }
        
        for(int i = 0 ; i < n; i++){
            int area = (rb[i] - lb[i] - 1) * heights[i];
            if(area > max){
                max = area;
            }
        }
        
        return max;
    }
}
