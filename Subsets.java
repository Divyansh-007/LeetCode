class Solution {
    
    public int[][] subsets(int[] arr, int si){
        if(si == arr.length){
            return new int[1][0];
        }
        
        int[][] temp = subsets(arr, si + 1);
        
        int[][] output = new int[2 * temp.length][];
        int index = 0;
        
        for(int i = 0; i < temp.length; i++){
            output[index] = temp[i];
            index++;
        }
        
        for(int i = 0; i < temp.length; i++){
            output[index] = new int[temp[i].length + 1];
            output[index][0] = arr[si];
            for(int j = 0; j < temp[i].length; j++){
                output[index][j + 1] = temp[i][j];
            }
            index++;
        }
        
        return output;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        int[][] sets = subsets(nums,0);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < sets.length; i++){
            List<Integer> curr = new ArrayList<>();
            for(int j = 0; j < sets[i].length; j++){
                curr.add(sets[i][j]);
            }
            ans.add(curr);
        }
        
        return ans;
    }
}
