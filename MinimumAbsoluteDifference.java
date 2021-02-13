class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        
        for(int i = 0; i + 1 < arr.length; i++){
            int min = arr[i + 1] - arr[i];
            if(min < minDiff){
                minDiff = min;
            }
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i + 1 < arr.length; i++){
            if(arr[i + 1] - arr[i] == minDiff){
                List<Integer> curr = new ArrayList<>();
                curr.add(arr[i]);
                curr.add(arr[i + 1]);
                ans.add(curr);
            }    
        }
        
        return ans;
    }
}
