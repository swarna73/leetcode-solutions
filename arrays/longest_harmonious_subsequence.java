class Solution {
    public int findLHS(int[] nums) {
                Map<Integer, Integer> freqMap = new HashMap<>();
        int longest = 0;

        // Count the frequency 
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Check if the map contains num + 1
        for (int key : freqMap.keySet()) {
            if (freqMap.containsKey(key + 1)) {
                int length = freqMap.get(key) + freqMap.get(key + 1);
                longest = Math.max(longest, length);
            }
        }

        return longest;

    }
}
