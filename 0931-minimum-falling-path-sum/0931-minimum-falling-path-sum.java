class Solution {
    public int find(int[][] arr){
        int m=arr.length;
        int n=arr[0].length;
        int[][] dp=new int[m][n];
        for(int j=0;j<n;j++) dp[0][j]=arr[0][j];
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int up=dp[i-1][j];
                int left=Integer.MAX_VALUE;
                int right=Integer.MAX_VALUE;

                if(j>0) left=dp[i-1][j-1];
                if(j<n-1) right=dp[i-1][j+1];

                dp[i][j]=arr[i][j]+Math.min(up,Math.min(left,right));
            }
        }

        int ans=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            ans=Math.min(ans,dp[n-1][j]);
        }
        return ans;

        
    }
    public int minFallingPathSum(int[][] matrix) {
        return find(matrix);
    }
}