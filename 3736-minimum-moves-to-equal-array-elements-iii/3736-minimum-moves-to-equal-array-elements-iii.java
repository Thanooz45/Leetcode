class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int diff=0;
        int ele=nums[n-1];
        for(int i=n-1;i>=0;i--){
            diff+=Math.abs(ele-nums[i]);
        }
        return diff;
        
    }
}