class CustomStack {

    ArrayList<Integer> st;
    int size;
    public CustomStack(int maxSize) {
        st = new ArrayList<Integer>();
        size = maxSize;
    }
    
    public void push(int x) {
        if(st.size() == size){
            return;
        }else{
            st.add(x);
        }
    }
    
    public int pop() {
        if(st.size() == 0){
            return -1;
        }else{
            return st.remove(st.size() - 1);
        }
    }
    
    public void increment(int k, int val) {
        for(int i = 0; i < k && i < st.size(); i++){
            st.set(i,st.get(i) + val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
