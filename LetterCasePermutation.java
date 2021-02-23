class Solution {
    
    public void per(char[] str, int si, List<String> res){
        if(si == str.length){
            res.add(new String(str));
        }else{
            if(Character.isLetter(str[si])){
                str[si] = Character.toUpperCase(str[si]);
                per(str,si + 1, res);
                str[si] = Character.toLowerCase(str[si]);
                per(str,si + 1, res);
            }else{
                per(str,si + 1,res);
            }
        }
    }
    
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        per(S.toCharArray(), 0, ans);
        return ans;
    }
}
