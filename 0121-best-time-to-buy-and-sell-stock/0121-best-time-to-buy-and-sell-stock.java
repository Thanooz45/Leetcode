class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if (n==1) return 0;
        int ele=prices[0];
        int diff=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            ele=Math.min(prices[i],ele);
            diff=Math.max(Math.abs(prices[i]-ele),diff);
        }
        return diff;
        
    }
}