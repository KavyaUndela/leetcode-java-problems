
       class Solution {
    public boolean isAnagram(String s, String t) {

        // Step 1: If lengths differ, not an anagram
        if (s.length() != t.length()) {
            return false;
        }

       
        int[] count = new int[26];

       
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

       
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
 
    