class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        
        // Extract 4 digits
        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10;
            num /= 10;
        }

        // Sort ascending: digits[0] <= digits[1] <= digits[2] <= digits[3]
        Arrays.sort(digits);

        // Pair smallest digits in tens place, largest in units place
        return (digits[0] + digits[1]) * 10 + digits[2] + digits[3];
    }
}