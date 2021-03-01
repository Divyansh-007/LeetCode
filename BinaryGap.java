class Solution {
    
    public ArrayList<Integer> decToBin(int num){
        if(num == 0){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(0);
            return ans;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(num > 0){
            ans.add(num % 2);
            num = num / 2;
        }
        
        Collections.reverse(ans);
        return ans;
    }
    
    public int binaryGap(int n) {
        ArrayList<Integer> bin = decToBin(n);
        
        int maxGap = 0;
        int prevInd = -1;
        
        for(int i = 0 ; i < bin.size(); i++){
            if(bin.get(i) == 1){
                if(prevInd == -1){
                    prevInd = i;
                    continue;
                }else{
                    int curr = i - prevInd;
                    if(curr > maxGap){
                        maxGap = curr;
                    }
                    prevInd = i;
                    continue;
                }
            }
        }
        
        return maxGap;
    }
}
