class Solution {
    public void find(int ind,List<List<Integer>> lis,int[] arr,int tar,List<Integer> al){
        if(tar==0){
            lis.add(new ArrayList<>(al));
            return;
        }
        if(ind==arr.length) return;
        if(arr[ind]<=tar){
            al.add(arr[ind]);
            // tar-=arr[ind];
            find(ind,lis,arr,tar-arr[ind],al);
            // tar+=arr[ind];
            al.remove(al.size()-1);
        }
        find(ind+1,lis,arr,tar,al);
        

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lis=new ArrayList<>();
        find(0,lis,candidates,target,new ArrayList<>());
        return lis;
    }
}