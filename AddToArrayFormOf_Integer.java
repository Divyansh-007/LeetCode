class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int n = A.length;
        int copy = K;
        List<Integer> ans = new ArrayList<>();
        
        int i = n - 1;
        
        while(i >= 0 || copy > 0){
            if(i >= 0){
                copy = copy + A[i];
            }
            ans.add(copy % 10);
            copy = copy / 10;
            i--;
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
}
