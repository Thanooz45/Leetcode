class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        Stack<Character> stk=new Stack<>();
        // String nst="";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                if(!stk.isEmpty()){
                    sb.append(c);
                }
                stk.push(c);
            }
            else{
                stk.pop();
                if(!stk.isEmpty()){
                    sb.append(c);
                }
            }
            
        }
        return sb.toString();
    }
}