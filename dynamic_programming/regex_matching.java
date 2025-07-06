class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true; // Empty string matches empty pattern

        // Handle patterns like a*, a*b*, a*b*c* that can match empty string
        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char currentPattern = p.charAt(j - 1);

                if (currentPattern == '.' || currentPattern == s.charAt(i - 1)) {
                    // Characters match or pattern is '.'
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (currentPattern == '*') {
                    // '*' can mean zero occurrence of the previous character
                    dp[i][j] = dp[i][j - 2];

                    // '*' can mean one or more occurrence if preceding char matches
                    if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                }
            }
        }

        return dp[m][n];
    }
}
