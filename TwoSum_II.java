class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int si = 0;
        int ei = numbers.length - 1;
        int[] index = new int[2];
        
        while(si < ei){
            if((numbers[si] + numbers[ei]) > target){
                ei--;
            }else if((numbers[si] + numbers[ei]) < target){
                si++;
            }else{
                index[0] = si + 1;
                index[1] = ei + 1;
                break;
            }
        }
        
        return index;
    }
}
