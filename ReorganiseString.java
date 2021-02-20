class Element{
    char ch;
    int freq;
    
    Element(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
}

class Solution {
    public String reorganizeString(String S) {
        int n = S.length();
        int[] count = new int[26];
        
        for(int i = 0; i < n; i++){
            count[S.charAt(i) - 'a']++;
        }
        
        PriorityQueue<Element> pq = new PriorityQueue<>((a,b) -> a.freq == b.freq ? a.ch - b.ch : b.freq - a.freq);
        
        for(int i = 0; i < 26; i++){
            if(count[i] > 0){
                if(count[i] > (n + 1) / 2){
                    return "";
                }
                Element newElem = new Element((char)('a' + i),count[i]);
                pq.add(newElem);
            }
        }
        
        StringBuilder ans = new StringBuilder();
        while(pq.size() >= 2){
            Element e1 = pq.poll();
            Element e2 = pq.poll();
            
            ans.append(e1.ch);
            ans.append(e2.ch);
            e1.freq--;
            e2.freq--;
            
            if(e1.freq > 0){
                pq.add(e1);
            }
            if(e2.freq > 0){
                pq.add(e2);
            }
        }
        
        if(pq.size() > 0){
            ans.append(pq.poll().ch);
        }
        
        return ans.toString();
    }
}
