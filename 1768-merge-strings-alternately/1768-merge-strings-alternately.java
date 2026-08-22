class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        StringBuilder sb=new StringBuilder();
        int l=0;
        int r=0;
        boolean shift=true;
        while(l<l1 && r<l2){
            if(shift){
                sb.append(word1.charAt(l));
                l++;
                shift=!shift;
            }
            else{
                sb.append(word2.charAt(r++));
                shift=!shift;
            }
        }
        while(l<l1) sb.append(word1.charAt(l++));
        while(r<l2) sb.append(word2.charAt(r++));

        return sb.toString();
        
    }
}