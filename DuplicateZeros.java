class Solution {
    public void duplicateZeros(int[] arr) {
        int possDup = 0;
        int len = arr.length - 1;
        
        for(int i = 0; i <= len - possDup; i++){
            if(arr[i] == 0){
                if(i == len - possDup){
                    arr[len] = 0;
                    len--;
                    break;
                }
                possDup++;
            }    
        }
        
        int ei = len - possDup;
        
        for(int i = ei; i >= 0; i--){
            if(arr[i] == 0){
                arr[i + possDup] = 0;
                possDup--;
                arr[i + possDup] = 0;
            }else{
                arr[i + possDup] = arr[i];
            }
        }
    }
}
