class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[256];
        
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)]++;
        }
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for(int i = 0 ; i < s.length() + 1; i++){
            list.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < freq.length; i++){
            if(freq[i] != 0){
                list.get(freq[i]).add(i);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = list.size() - 1; i >=0; i--){
            if(list.get(i) != null){
                ArrayList<Integer> curr = list.get(i);
                for(int k = 0; k < curr.size(); k++){
                    for(int m = 0; m < i; m++){
                        sb.append(Character.toChars(curr.get(k)));
                    }
                }
            }
        }
        
        return sb.toString();
    }
}
