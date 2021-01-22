class Solution {
    public int numSpecialEquivGroups(String[] A) {
        HashSet<String> s = new HashSet<>();
        for(String a : A) {
            int[] odd = new int[26], even = new int[26];
            for(int i=0; i<a.length(); i++) {
                if(i%2==0)
                    even[a.charAt(i)-'a']++;
                else
                    odd[a.charAt(i)-'a']++;
            }
            s.add(Arrays.toString(odd)+Arrays.toString(even));
        }
        return s.size();    
    }
    
}
