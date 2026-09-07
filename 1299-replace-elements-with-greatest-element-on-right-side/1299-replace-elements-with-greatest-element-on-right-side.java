class Solution {
    public int[] replaceElements(int[] arr) {
        // int ele=arr[arr.length-1];
        int n=arr.length;
        // int
        int maxsofar=arr[n-1];
        arr[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            int temp=arr[i];
            arr[i]=maxsofar;
            maxsofar=Math.max(maxsofar,temp);
        }
        return arr;
    }
}