class Solution {
    public int find(int[][] arr){
        if(arr[0][0]==1) return 0;
        
        int m=arr.length;
        int n=arr[0].length;
        if(arr[m-1][n-1]==1) return 0;
        int[][] dp=new int[m][n];
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0) continue;
                // if(arr[i][j]==1) dp[i][j]=0;
                int front=0;
                if(j>0 && arr[i][j-1]!=1) front =dp[i][j-1];
                int down=0;
                if(i>0 && arr[i-1][j]!=1) down=dp[i-1][j];

                dp[i][j]=front+down;
            }
        }
        return dp[m-1][n-1];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        return find(obstacleGrid);
        
    }
}