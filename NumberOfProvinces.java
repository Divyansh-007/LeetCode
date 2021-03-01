class Solution {
    
    public void dfsTraversal(int[][] adjMatrix, int currVer, boolean[] visited){
        visited[currVer] = true;
        
        for(int i = 0 ; i < adjMatrix.length; i++){
            if(adjMatrix[currVer][i] == 1 && visited[i] == false){
                dfsTraversal(adjMatrix,i,visited);
            }
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        
        for(int i = 0; i < isConnected.length; i++){
            if(visited[i] == false){
                dfsTraversal(isConnected,i,visited);
                count++;
            }
        }
        
        return count;
    }
}
