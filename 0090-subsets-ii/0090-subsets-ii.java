class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lis=new ArrayList<>();
        int n=nums.length;
        find(0,nums,lis,new ArrayList<Integer>());
        return lis;
    }
    public void find(int ind,int[] arr,List<List<Integer>> lis,ArrayList<Integer> al){
        if(ind>=arr.length) {
            lis.add(new ArrayList<>(al));
            return;
        }
        al.add(arr[ind]);
        find(ind+1,arr,lis,al);
        al.remove(al.size()-1);
        while(ind+1<arr.length && arr[ind]==arr[ind+1]) ind++;
        find(ind+1,arr,lis,al);
    }
}