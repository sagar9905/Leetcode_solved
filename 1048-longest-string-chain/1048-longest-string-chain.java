import java.util.*;

class Solution {

    public int longestStrChain(String[] words) {
        int n = words.length;

        // sort by length
        Arrays.sort(words, (a, b) -> a.length() - b.length());

        int dp[] = new int[n];
        Arrays.fill(dp, 1);

        int maxlen = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {  // only previous words
                if (rec(words, i, j)) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
            maxlen = Math.max(maxlen, dp[i]);
        }

        return maxlen;
    }

    // predecessor check
    public boolean rec(String words[], int i, int p) {
        String small = words[p];
        String big = words[i];

        if (big.length() - small.length() != 1) return false;

        int idx1 = 0, idx2 = 0;
        boolean skipped = false;

        while (idx1 < small.length() && idx2 < big.length()) {
            if (small.charAt(idx1) == big.charAt(idx2)) {
                idx1++;
                idx2++;
            } else {
                if (skipped) return false;
                skipped = true;
                idx2++; // skip one char in big
            }
        }

        return true;
    }
}