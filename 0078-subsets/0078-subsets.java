class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lis=new ArrayList<>();
        int n=nums.length;
        find(0,nums,n,lis,new ArrayList<>());
        return lis;
    }
    public void find(int ind,int[] arr,int n,List<List<Integer>> lis,List<Integer> al){
        if(ind>=n){
            lis.add(new ArrayList<>(al));
        return;
    }
        al.add(arr[ind]);
        find(ind+1,arr,n,lis,al);
        al.remove(al.size()-1);
        find(ind+1,arr,n,lis,al);
    }
}