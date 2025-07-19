public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0; // Position to write the next valid element

        for (int num : nums) {
            // Accept if less than 2 duplicates OR current != element at i-2
            if (i < 2 || num != nums[i - 2]) {
                nums[i] = num;
                i++;
            }
        }

        return i; // Final count of valid elements
    }
}
