class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hmp=new HashMap<>();
        int maxlen=0;
        int l=0;
        int r=0;
        int n=fruits.length;
        int lmt=hmp.size();
        while(r<n){
            int ele=fruits[r];
            hmp.put(ele,hmp.getOrDefault(ele,0)+1);
            if(hmp.size()>2){
                while(hmp.size()>2){
                    int elee=fruits[l];
                    hmp.put(elee,hmp.get(elee)-1);
                    if(hmp.get(elee)==0) hmp.remove(elee);
                    l++;
                }
                
            }

            if(lmt<=2){
                int len=r-l+1;
                maxlen=Math.max(len,maxlen);
            }
            r++;
        }
        return maxlen;
        
    }
}