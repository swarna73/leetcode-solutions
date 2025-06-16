class Solution {
    public String longest-prefix(String[] strs) {
        
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0]; // start with the first word

        for (int i = 1; i < strs.length; i++) {
            // keep trimming the prefix until it matches the start of current word
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}
