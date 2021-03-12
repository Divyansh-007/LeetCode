class Solution {
    
    public ArrayList<Integer> decToBin(int n){
        if(n == 1){
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(1);
            return ans;
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(n > 0){
            ans.add(n % 2);
            n = n / 2;
        }
        
        Collections.reverse(ans);
        
        return ans;
    }
    
    public int binToDec(ArrayList<Integer> bin){
        int ans = 0;
        int p = 0;
        
        for(int i = bin.size() - 1; i >=0; i--){
            ans = ans + bin.get(i) * (int)(Math.pow(2,p));
            p++;
        }
        
        return ans;
    }
    
    public int bitwiseComplement(int N) {
        if(N == 0){
            return 1;
        }
        
        ArrayList<Integer> bin = decToBin(N);
        
        for(int i = 0; i < bin.size(); i++){
            if(bin.get(i) == 1){
                bin.set(i,0);
            }else{
                bin.set(i,1);
            }
        }
        
        return binToDec(bin);
    }
}
