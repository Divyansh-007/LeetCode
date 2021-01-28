class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        double sum = 0.0;
        int n = arr.length;
        
        for(int i = n / 20; i <(n - n / 20); i++){
            sum = sum + arr[i];
        }
        
        return sum / (0.9 * n);
    }
}
