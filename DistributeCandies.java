class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < candyType.length; i++){
            if(map.containsKey(candyType[i])){
                map.put(candyType[i],map.get(candyType[i]) + 1);
                continue;
            }
            
            map.put(candyType[i],1);
        }
        
        int max = candyType.length / 2;
        
        return Math.min(max,map.size());
    }
}
