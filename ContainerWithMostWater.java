class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int si = 0;
        int ei = height.length - 1;
        
        while(si < ei){
            int curr = (ei - si) * Math.min(height[si],height[ei]);
            max = Math.max(max,curr);
            
            if(height[si] < height[ei]){
                si++;
            }else{
                ei--;
            }
        }
        
        return max;
    }
}
