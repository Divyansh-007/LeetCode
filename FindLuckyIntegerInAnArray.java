class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int  i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
                continue;
            }
            
            map.put(arr[i],1);
        }
        
        int ans = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(map.get(arr[i]) == arr[i]){
                if(arr[i] > ans){
                    ans = arr[i];
                }
            }
        }
        
        return ans;
    }
}
