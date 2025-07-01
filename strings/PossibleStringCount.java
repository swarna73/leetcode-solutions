public class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        int i = 0;
        int total = 1; // At least 1 valid original (no mistake case)

        while (i < n) {
            char currentChar = word.charAt(i);
            int start = i;

            while (i < n && word.charAt(i) == currentChar) i++;

            int groupLength = i - start;

            // If groupLength >= 2 → we can drop characters to form a possible original
            if (groupLength >= 2) {
                // For this group, we can have (groupLength - 1) possible mistakes (removing 1, 2, ..., all but one)
                total += (groupLength - 1);
            }
        }

        return total;
    }
}
