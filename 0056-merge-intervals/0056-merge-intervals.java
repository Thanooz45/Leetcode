class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        if(n<=1) return intervals;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> merged=new ArrayList<>();
        for(int[] interval:intervals){
            if(merged.isEmpty() || interval[0]>merged.get(merged.size()-1)[1]){
                merged.add(interval);
            }
            else{
                int[] lstint=merged.get(merged.size()-1);
                lstint[1]=Math.max(lstint[1],interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}