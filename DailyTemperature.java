class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[T.length];
        
        for(int i = 0; i < T.length; i++){
            while(!st.isEmpty() && T[i] > T[st.peek()]){
                int index = st.pop();
                res[index] =  i - index;
            }
            st.push(i);
        }
        
        return res;
    }
}
