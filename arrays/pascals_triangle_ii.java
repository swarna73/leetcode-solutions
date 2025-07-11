class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // First element is always 1

        for (int i = 1; i <= rowIndex; i++) {
            // Add 0 at end to facilitate in-place update from right to left
            row.add(0); 
            for (int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }
}
