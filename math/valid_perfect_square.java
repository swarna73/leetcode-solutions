class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true; // 1 is a perfect square

        int left = 2;
        int right = num / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid; // use long to avoid overflow

            if (square == num) return true;
            if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false; 
    }
}
