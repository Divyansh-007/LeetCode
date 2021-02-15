class NumMatrix {
    
    int[][] mat;
    public NumMatrix(int[][] matrix) {
        mat = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int p = row1; p <= row2; p++){
            for(int q = col1; q <= col2; q++){
                sum += mat[p][q];
            }
        }
        
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
