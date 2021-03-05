class Solution {
    
    public int largestRect(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int[] rb = new int[n];
        Stack<Integer> st = new Stack<>();
        rb[n - 1] = n;
        st.push(n - 1);
        
        for(int i = n - 2; i >= 0; i--){
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
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
        lb[0] = -1;
        st.push(0);
        
        for(int i = 1; i < n; i++){
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            
            if(st.isEmpty()){
                lb[i] = -1;
            }else{
                lb[i] = st.peek();
            }
            
            st.push(i);
        }
        
        for(int i = 0; i < n; i++){
            int area = arr[i] * (rb[i] - lb[i] - 1);
            if(area > max){
                max = area;
            }
        }
        
        return max;
    }
    
    public int maxRect(int m ,int n, int[][] arr){
        if(m == 0 || n == 0){
            return 0;
        }
        
        int ans = largestRect(arr[0]);
        
        for(int i = 1; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == 1){
                    arr[i][j] = arr[i][j] + arr[i - 1][j];
                }
            }
            ans = Math.max(ans,largestRect(arr[i]));
        }
        
        return ans;
    }
    
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        if(m == 0){
            return 0;
        }
        int n = matrix[0].length;
        int[][] copy = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == '0'){
                    copy[i][j] = 0;
                }else{
                    copy[i][j] = 1;
                }
            }
        }
        
        return maxRect(m,n,copy);
    }
}
