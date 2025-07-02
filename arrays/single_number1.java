public class Solution {
    public int singleNumber1(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num; // XOR each number
        }

        return result; // The unique number remains
    }
}
