class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < arr1.length; i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i], map.get(arr1[i]) + 1);
                continue;
            }
            
            map.put(arr1[i], 1);
        }
        
        int[] ans = new int[arr1.length];
        int k = 0;
        for(int i = 0; i < arr2.length; i++){
            if(map.containsKey(arr2[i])){
                for(int j = 0; j < map.get(arr2[i]); j++){
                    ans[k] = arr2[i];
                    k++;
                }
                map.remove(arr2[i]);
            }
        }
        
        if(map.size() != 0){
            Set<Integer> keys = map.keySet();
            ArrayList<Integer> remList = new ArrayList<>();
            for(int key : keys){
                for(int i = 0; i < map.get(key); i++){
                    remList.add(key);
                }
            }
            
            int[] remAns = new int[remList.size()];
            for(int i = 0; i < remList.size(); i++){
                remAns[i] = remList.get(i);    
            }
            
            Arrays.sort(remAns);
            
            for(int i = 0; i < remAns.length; i++){
                ans[k] = remAns[i];
                k++;
            }
        }
        
        return ans;
    }
}
