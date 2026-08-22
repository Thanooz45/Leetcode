class Solution {
    public boolean checkDivisibility(int n) {

        int k=n;
        int sum=0;
        int mul=1;
        while(k>0){
            int rem=k%10;
            sum=sum+rem;
            mul=mul*rem;
            k=k/10;
        }
        return (n%(sum+mul)==0);
        
    }
}