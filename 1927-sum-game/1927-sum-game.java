class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        char[] arr=num.toCharArray();
        int diff=0;
        int qdiff=0;
        for(int i=0;i<n/2;i++){
            char c=num.charAt(i);
            if(c=='?') qdiff++;
            else{
                diff+=c-'0';
            }
        }
        for(int i=n/2;i<n;i++){
            char c=num.charAt(i);
            if(c=='?') qdiff--;
            else{
                diff-=c-'0';
            }
        }
        return (qdiff % 2 != 0) || (diff * 2 + qdiff * 9 != 0);

        
    }
}