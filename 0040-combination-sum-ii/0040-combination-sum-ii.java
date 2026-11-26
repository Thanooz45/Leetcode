class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lis=new ArrayList<>();

        find(0,candidates,target,new ArrayList<>(),lis);
        return lis;   
    }
    public void find(int ind,int[] arr, int tar,List<Integer> al,List<List<Integer>> lis){
        if(tar==0){
            lis.add(new ArrayList<>(al));
            return;
        }
        if(ind==arr.length) return;
        

        if(arr[ind]<=tar){
            al.add(arr[ind]);
            find(ind+1,arr,tar-arr[ind],al,lis);
            al.remove(al.size()-1);
        }
        while(ind+1<arr.length && arr[ind]==arr[ind+1]) ind++;
        find(ind+1,arr,tar,al,lis);
    }
}