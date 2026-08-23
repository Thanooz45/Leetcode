class Solution {
    public int singleNumber(int[] nums) {
        int or=0;
        for(int i:nums){
            or=or^i;
        }
        return or;
        
    }
}