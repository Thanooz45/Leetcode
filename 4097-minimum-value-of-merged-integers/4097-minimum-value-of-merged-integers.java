class Solution {
    public int minMergedInteger(int[] nums) {
        int prev=Integer.MAX_VALUE;
        int curr;
        for(int i=0;i<nums.length;i+=2){
            curr=Integer.valueOf(String.valueOf(nums[i])+String.valueOf(nums[i+1]));
            prev=Math.min(curr,prev);
        }
        return prev;
        
    }
}