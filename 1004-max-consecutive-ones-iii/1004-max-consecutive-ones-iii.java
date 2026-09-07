class Solution {
    public int longestOnes(int[] arr, int k) {
        int n=arr.length;
        int l=0,r=0;
        int maxlen=0;
        int zeros=0;

        while(r<n){
            if(arr[r]==0){
                zeros++;
            }
            if(zeros>k){
                // while(zeros==k){
                    if(arr[l++]==0) zeros--;
                // }
            }
            if(zeros<=k){
                int len=r-l+1;
                maxlen=Math.max(len,maxlen);
            }
            
            r++;
        }
        return maxlen;
    }
}