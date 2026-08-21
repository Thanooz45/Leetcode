class Solution {
   public void dfs(int[][] arr,int r,int c,int clr,int newc){
        if(arr[r][c]==clr){
            arr[r][c]=newc;
            if(r>=1) dfs(arr,r-1,c,clr,newc);
            if(c>=1) dfs(arr,r,c-1,clr,newc);
            if(r+1<arr.length) dfs(arr,r+1,c,clr,newc);
            if(c+1<arr[0].length) dfs(arr,r,c+1,clr,newc);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        int clr=image[sr][sc];
        // go(image,sr,sc,color,image[sr][sc]);
        dfs(image,sr,sc,clr,color);
        return image;
    }
}