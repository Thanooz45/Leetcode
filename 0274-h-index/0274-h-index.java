class Solution {
    public int hIndex(int[] citations) {

        // Arrays.sort(citiations);
        int n=citations.length;
        int[] arr=new int[n+1];

        for(int c:citations){
            if(c>=n){
                arr[n]++;
            }
            else{
                arr[c]++;
            }
        }
        int tp=0;
        for(int i=n;i>=0;i--){
            tp+=arr[i];
            if(tp>=i) return i;
        }
        return 0;
    }
}