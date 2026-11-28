class Solution {
    public int findKthPositive(int[] arr, int k) {
        int ans=0;
        int newarr[]=new int[2001];
        for(int i=0;i<arr.length;i++){
            newarr[arr[i]]=1;
        }
        int c=0;
        for(int i=1;i<newarr.length;i++){
            
            if(newarr[i]==0){
                c++;
            }
            if(c==k){
                ans=i;
                break;
            }
        }
        return ans;
    }
}