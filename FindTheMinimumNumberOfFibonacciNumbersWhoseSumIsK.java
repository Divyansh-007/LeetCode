class Solution {
    
    public ArrayList<Integer> genFib(int n){
        int a = 1;
        int b = 1;
        int c = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(a);
        ans.add(b);
        
        while(c <= n){
            c = a + b;
            ans.add(c);
            a = b;
            b = c;
        }
        
        return ans;
    }
    
    public int findMinFibonacciNumbers(int k) {
        ArrayList<Integer> numbers = genFib(k);
        
        for(int elem : numbers){
            System.out.print(elem + " ");
        }
        
        int flag = 0;
        
        for(int i = numbers.size() - 1; i >= 0; i--){
            if(numbers.get(i) <= k){
                flag = i;
                break;
            }
        }
        
        int copy = k;
        int count = 0;
        
        for(int i = flag; i >= 0; i--){
            if(copy == 0){
                break;
            }else{
                int curr = numbers.get(i);
                if(copy - curr >= 0){
                    count++;
                    copy = copy - curr;
                }else{
                    continue;
                }
            }
        }
        
        return count;
    }
}
