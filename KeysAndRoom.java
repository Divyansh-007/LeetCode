class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        while(!st.isEmpty()){
            int curr = st.pop();
            for(int k : rooms.get(curr)){
                if(!visited[k]){
                    visited[k] = true;
                    st.push(k);
                }
            }
        }
        
        for(boolean v : visited){
            if(!v){
                return false;
            }
        }
        
        return true;
    }
}
