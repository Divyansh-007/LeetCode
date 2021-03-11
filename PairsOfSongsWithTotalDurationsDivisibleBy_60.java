class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] rem = new int[60];
        int count = 0;
        
        for(int t : time){
            if(t % 60 == 0){
                count = count + rem[0];
            }else{
                count = count + rem[60 - (t % 60)];
            }
            
            rem[t % 60]++;
        }
        
        return count;
    }
}
