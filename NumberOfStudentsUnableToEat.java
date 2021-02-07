class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        
        for(int st : students){
            q.add(st);
        }
        
        int i = 0;
        int count = 0;
        
        while(!q.isEmpty() && count != q.size()){
            if(q.peek() == sandwiches[i]){
                count = 0;
                i++;
                q.poll();
            }else{
                count++;
                q.add(q.remove());
            }
        }
        
        // System.out.print(count + " " + q.size());
        return count;
    }
}
