class Solution {
    public void generatePerm(char[] arr, int n, String res, ArrayList<String> list){
        if(n == 0){
            list.add(res);
            return;
        }
        
        for(int i=0; i<arr.length; i++){
           if(res.equals("") || res.charAt(res.length()-1) != arr[i]){
                String pre=res+arr[i];
                generatePerm(arr, n-1, pre, list);
            }
        }
        
    }
    
    public String getHappyString(int n, int k) {
        char[] arr = {'a', 'b', 'c'};
        String res="";
        ArrayList<String> list =new ArrayList<>();
        
        generatePerm(arr, n, res, list);
        
        if(list.size() >= k){
            res=list.get(k-1);
        }
            
        return res;
    }
}
