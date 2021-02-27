class Solution {
    public int[] plusOne(int[] digits) {
        int[] revNum = new int[digits.length];
        int j = 0;
        
        for(int i = digits.length - 1; i >=0; i--){
            revNum[j] = digits[i];
            j++;
        }
        
        for(int elem : revNum){
            System.out.print(elem + " ");
        }
        
        int carry = 1;
        ArrayList<Integer> nextNum = new ArrayList<>();
        
        for(int i = 0; i < revNum.length; i++){
            int sum = revNum[i] + carry;
            
            if(sum > 9){
                nextNum.add(sum % 10);
                carry = 1;
            }else{
                nextNum.add(sum);
                carry = 0;
            }
        }
        
        if(carry != 0){
            nextNum.add(carry);    
        }
        
        
        int[] ans = new int[nextNum.size()];
        int k = 0;
        
        for(int i = nextNum.size() - 1; i >=0; i--){
            ans[k] = nextNum.get(i);
            k++;
        }
        
        return ans;
    }
}
