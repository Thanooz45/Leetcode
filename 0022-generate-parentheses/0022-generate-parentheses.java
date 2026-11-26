class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lis=new ArrayList<>();
        find(lis,"",0,0,n);
        return lis;
        

    }
    public void find(List<String> lis,String str,int op,int cl,int n){
        if(str.length()==2*n){
            lis.add(str);
            return;
        }
        if(op<n){
            find(lis,str+"(",op+1,cl,n);
            
        }
        if(cl<op){
            find(lis,str+")",op,cl+1,n);
        }
    }
}