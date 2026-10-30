class Solution {

    public int find(int[][] grid,int r,int c,int m,int n){
        if(r==m-1 && c==n-1) return 1;
        if(r<0 || r>=m || c<0 || c>=n) return 0;
        return find(grid,r+1,c,m,n)+find(grid,r,c+1,m,n);
    }

    //memorization
    public int findbydp(int[][]dp ,int r,int c,int m,int n){
        if(r==m-1 && c==n-1) return 1;
        if(r<0 || r>=m || c<0 || c>=n) return 0;
        if(dp[r][c]!=-1) return dp[r][c];
        dp[r][c]=find(dp,r+1,c,m,n)+find(dp,r,c+1,m,n);
        return dp[r][c];
    }

    //tabulation
    
    public int uniquePaths(int m, int n) {

        // int [][] grid=new int[m][n];

        // return find(grid,0,0,m,n);

        // int[][] dp=new int[m][n];
        // for(int[] row :dp){
        //     Arrays.fill(row,-1);
        // }
        
        // return findbydp(dp,0,0,m,n);


        //tabulation 

        int dpt[][]=new int[m][n];
        dpt[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0 ) continue;
                int up=0;
                if (i>0) up=dpt[i-1][j];
                int down=0;
                if(j>0) down=dpt[i][j-1];
                dpt[i][j]=up+down;
            }
        }
        return dpt[m-1][n-1];
        
    }
}