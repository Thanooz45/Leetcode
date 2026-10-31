class Solution {
    int ans;
    public int find(int i,int j,int m,int n,List<List<Integer>> triangle){

        // if(i<0 || j<0 || i>=m || j>=n) return 0;

        // int down=triangle.get(i).get(j+1);
        // int diag=triangle.get(i+1).get(j+1);
        // if(down<diag){
        //     ans+=down;
        //     return ans+find(i,j+1,m,n,triangle);
        // }
        // ans+=diag;
        // return ans+find(i+1,j+1,m,n,triangle);

        if(i==m-1) return triangle.get(m-1).get(j);
        int down=triangle.get(i).get(j)+find(i+1,j,m,n,triangle);
        int diag=triangle.get(i).get(j)+find(i+1,j+1,m,n,triangle);

        return Math.min(down,diag);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        
        ans=0;
        int n=triangle.size();
        // PriorityQueue<List<Integer>> pq=new PriorityQueue<>((a,b)->)
        // int st=ltriangle.get(0).get(0);
        // for(int i=1;i<triangle.size();i++){

        // }
        // return find(0,0,triangle.size(),triangle.get(0).size(),triangle);
        // return ans;
        int[][] dp=new int[n][n];

        for(int j=0;j<n;j++){
            dp[n-1][j]=triangle.get(n-1).get(j);
        }

        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int diag=dp[i+1][j+1]+triangle.get(i).get(j);
                int down=dp[i+1][j]+triangle.get(i).get(j);
                dp[i][j]=Math.min(diag,down);
            }
        }
        return dp[0][0];
    }
}