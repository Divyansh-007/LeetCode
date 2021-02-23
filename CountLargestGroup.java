class Solution {
    
    public int sumOfDig(int num){
        if(num == 0){
            return 0;
        }
        
        int sum = 0;
        while(num > 0){
            sum = sum + num % 10;
            num = num / 10;
        }
        
        return sum;
    }
    
    public int countLargestGroup(int n) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        int maxSize = 1;
        
        for(int i = 1; i <= n; i++){
            int sum = sumOfDig(i);
            if(map.containsKey(sum)){
                ArrayList<Integer> curr = map.get(sum);
                curr.add(i);
                if(curr.size() > maxSize){
                    maxSize = curr.size();
                }
                map.put(sum,curr);
                continue;
            }
            
            ArrayList<Integer> list = new ArrayList<>();
            list.add(i);
            
            map.put(sum,list);
        }
        
        Set<Integer> keys = map.keySet();
        
        // for(int key : keys){
        //     System.out.print(key + "->");
        //     ArrayList<Integer> curr = map.get(key);
        //     for(int elem : curr){
        //         System.out.print(elem + " ");
        //     }
        // }
        
        int count = 0;
        
        for(int key : keys){
            ArrayList<Integer> curr = map.get(key);
            if(curr.size() == maxSize){
                count++;
            }
        }
        
        return count;
    }
}
