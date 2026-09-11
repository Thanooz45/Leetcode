class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;

        // Check all possible 3-digit even numbers: 100 to 998
        for (int num = 100; num <= 998; num += 2) {
            int h = num / 100;
            int t = (num / 10) % 10;
            int u = num % 10;

            int[] needed = new int[10];
            needed[h]++;
            needed[t]++;
            needed[u]++;

            if (needed[h] <= freq[h] && needed[t] <= freq[t] && needed[u] <= freq[u]) {
                count++;
            }
        }

        return count;
    }
}