class Solution {
    public String modifyString(String s) {
        HashMap<Integer,Character> map = new HashMap<>();
        
        for(int i = 97; i <= 122; i++){
            map.put(i,(char)(i));
        }
        
        Set<Integer> keys = map.keySet();
        char[] chars = s.toCharArray();
        
        if(chars.length == 1){
            if(chars[0] == '?'){
                chars[0] = map.get(97);
                return new String(chars);
            }else{
                return new String(chars);
            }
        }
        
        
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == '?'){
                if(i == 0){
                    int next = (int)(chars[i + 1]);
                    for(int key : keys){
                        if(key != next){
                            chars[i] = map.get(key);
                            break;
                        }
                    }
                }else if(i == chars.length - 1){
                    int prev = (int)(chars[i - 1]);
                    for(int key : keys){
                        if(key != prev){
                            chars[i] = map.get(key);
                            break;
                        }
                    }
                }else{
                    int prev = (int)(chars[i - 1]);
                    int next = (int)(chars[i + 1]);
                    for(int key : keys){
                        if(key != prev && key != next){
                            chars[i] = map.get(key);
                            break;
                        }
                    }
                }
            }else{
                continue;
            }
        }
        
        return new String(chars);
    }
}
