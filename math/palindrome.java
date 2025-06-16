// Problem: https://leetcode.com/problems/palindrome-number/
// Level: Easy
// Tags: Math, String
// Date Solved: 15 June 2025

class Solution {
    public boolean palindrome(int x) {
// Negative numbers and numbers ending in 0 (except 0 itself) are not palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        String str = Integer.toString(x);
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}
