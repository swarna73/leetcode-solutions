import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
         int n = s.length();
        int maxLength = 0;

        int left = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            // If duplicate, move left pointer until the duplicate is removed
            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
