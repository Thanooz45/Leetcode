class Solution {
    public int missingMultiple(int[] nums, int k) {
        // Arrays.sort(nums);
        int miss=-1;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums) hs.add(i);
        int cm=k;
       while(true){
            if(!hs.contains(cm)){
                return cm;
            }
            cm+=k;
        }
        // return miss;

        
    }
}