class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        HashMap<Character,Integer> map = new HashMap<>();
        int lines = 1;
        int max_line_width = 100;
        int line_width = 0;
        
        for(int i = 0; i < widths.length; i++){
            map.put((char)('a' + i),widths[i]);
        }
        
        Set<Character> keys = map.keySet();
        for(char key : keys){
            System.out.print(key + "->" + map.get(key));
        }
        
        int[] ans = new int[2];
        
        for(int i = 0; i < S.length(); i++){
            int curr_width = map.get(S.charAt(i));
            if(line_width + curr_width <= max_line_width){
                line_width += curr_width; 
            }else{
                lines++;
                line_width = 0;
                line_width += curr_width;
            }
        }
        
        ans[0] = lines;
        ans[1] = line_width;
        
        return ans;
    }
}
