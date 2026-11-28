class Solution {
    public int findKthPositive(int[] arr, int k) {
        // int ans=0;
        // int newarr[]=new int[2001];
        // for(int i=0;i<arr.length;i++){
        //     newarr[arr[i]]=1;
        // }
        // int c=0;
        // for(int i=1;i<newarr.length;i++){
            
        //     if(newarr[i]==0){
        //         c++;
        //     }
        //     if(c==k){
        //         ans=i;
        //         break;
        //     }
        // }
        // return ans;

        int left=0,right=arr.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            int missing=arr[mid]-(mid+1);

            if(missing<k){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return left+k;
    }
}