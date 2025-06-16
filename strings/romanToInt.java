// Problem: https://leetcode.com/problems/roman-to-integer/
// Level: Easy
// Tags: String, HashMap
// Date Solved: 2025-06-06

import java.util.Map;

 class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int total = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = romanMap.get(s.charAt(i));
            if (current < prev) {
                total -= current;
            } else {
                total += current;
            }
            prev = current;
        }

        return total;
    }
}
