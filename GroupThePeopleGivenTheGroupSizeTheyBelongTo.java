class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            if(map.containsKey(groupSizes[i])){
                ArrayList<Integer> curr = map.get(groupSizes[i]);
                curr.add(i);
                map.put(groupSizes[i],curr);
                continue;
            }
            
            ArrayList<Integer> list = new ArrayList<>();
            list.add(i);
            map.put(groupSizes[i],list);
        }
        
        Set<Integer> keys = map.keySet();
        
        for(int key : keys){
            System.out.print(key + ":");
            ArrayList<Integer> curr = map.get(key);
            
            for(int elem : curr){
                System.out.print(elem + " ");
            }
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int key : keys){
                int size = key;
                ArrayList<Integer> curr = map.get(key);
                ArrayList<Integer> grp = new ArrayList<>();
                int index = 0;
                
                while(index != curr.size()){
                    if(grp.size() != size){
                        grp.add(curr.get(index));
                        index++;
                        continue;
                    }else{
                        ans.add(grp);
                        grp = new ArrayList<>();
                        grp.add(curr.get(index));
                        index++;
                        continue;
                    }
                }
                
                ans.add(grp);
        }
        
        return ans;
    }
}
