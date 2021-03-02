class Solution {
    public int findSpecialInteger(int[] arr) {
        int minFreq = (int)(arr.length * 0.25);
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
                continue;
            }
            
            map.put(arr[i],1);
        }
        
        Set<Integer> keys = map.keySet();
        int ans = 0;
        
        for(int key : keys){
            if(map.get(key) > minFreq){
                ans = key;
                break;
            }
        }
        
        return ans;
    }
}
