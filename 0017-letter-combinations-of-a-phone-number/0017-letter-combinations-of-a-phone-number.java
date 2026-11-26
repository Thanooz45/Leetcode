class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> lis = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return lis;
        }

        Map<Character, String> hmp = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
        );

        find(digits, 0, hmp, new StringBuilder(), lis);
        return lis;
    }

    private void find(String digits, int idx, Map<Character, String> hmp, StringBuilder sb, List<String> lis) {
        if (idx == digits.length()) {
            lis.add(sb.toString());
            return;
        }

        String letters = hmp.get(digits.charAt(idx));
        for (int i = 0; i < letters.length(); i++) {
            sb.append(letters.charAt(i));
            find(digits, idx + 1, hmp, sb, lis);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}