class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> lis=new ArrayList<>();
        find(0,arr,lis,new ArrayList<>(),k,n);
        return lis;

        
    }
    public void find(int ind,int[] arr, List<List<Integer>> lis, ArrayList<Integer>al,int lim,int tar){
        if(al.size()>lim ) return;
        if(al.size()==lim ){
            if(tar==0){
                lis.add(new ArrayList<>(al));
            }
                return;
        }
        if(ind>=arr.length) return;
        if(arr[ind]<=tar){
            al.add(arr[ind]);
            find(ind+1,arr,lis,al,lim,tar-arr[ind]);
            al.remove(al.size()-1);
        }
        find(ind+1,arr,lis,al,lim,tar);
    }
}