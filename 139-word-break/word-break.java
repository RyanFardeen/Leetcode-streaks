class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length()];
        return solve(s, dict, 0, memo);
    }

    private boolean solve(String s, Set<String> dict, int start, Boolean[] memo) {
        if (start == s.length()) return true;

        if (memo[start] != null) return memo[start];

        for (int end = start + 1; end <= s.length(); end++) {
            String prefix = s.substring(start, end);

            if (dict.contains(prefix) && solve(s, dict, end, memo)) {
                return memo[start] = true;
            }
        }

        return memo[start] = false;
    }
}