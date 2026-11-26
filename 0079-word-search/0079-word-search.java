class Solution {
    public boolean exist(char[][] board, String word) {
        // int n=word.length();
        int m=board.length;
        int n=board[0].length;
        // int ind=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(find(i,j,board,word,m,n,0)){
                    return true;
                }
            }
        }
        return false;
        
    }
    public boolean find(int r,int c,char[][] arr,String str,int m,int n,int ind){
        if(ind==str.length()) return true;
        if(r<0 || r>=m || c<0 || c>=n || arr[r][c]!=str.charAt(ind)) return false;
        
        
        char temp=arr[r][c];
        arr[r][c]='#';
        boolean found=find(r + 1, c, arr, str, m, n, ind + 1) ||
                        find(r, c + 1, arr, str, m, n, ind + 1) ||
                        find(r - 1, c, arr, str, m, n, ind + 1) ||
                        find(r, c - 1, arr, str, m, n, ind + 1);
        arr[r][c]=temp;
        return found;
    }
}