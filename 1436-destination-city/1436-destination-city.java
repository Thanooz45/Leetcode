class Solution {
    public String destCity(List<List<String>> paths) {
        if(paths.size()==0) return "";
        if(paths.size()==1) return new String(paths.get(0).get(1));
        int n=paths.size();
        HashMap<String,String> hmp=new HashMap<>();
        for(int i=0;i<n;i++){
            hmp.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        // String from=null;
        String to=paths.get(0).get(1);
        while(hmp.containsKey(to)){
            to=hmp.get(to);
        }
        return to;


        
    }
}