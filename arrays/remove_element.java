class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0; 

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j]; // overwrite val with valid element
                i++;
            }
        }

        return i; // i = number of elements not equal to val
    }
}
