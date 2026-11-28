class Solution {
    public int mySqrt(int x) {
        long i = 0;

        while ((i + 1) * (i + 1) <= x) {
            i++;
        }

        return (int) i;
    }
}