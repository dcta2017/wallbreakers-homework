/**
Daziah Turner, 10/01/2019. The following class is my solution to the Isomorphic Strings challenge on LeetCode. It takes in 
two strings as the parameters and returns a boolean value to determine whether or not the two strings are isomorphic.
*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Create an array of chars for s
        char c[] = new char[s.length()];
        int count1 = 0;
        int double1 = 0;
        // Create an array of chars for t
        char d[] = new char[t.length()];
        int count2 = 0;
        int double2 = 0;

        // Traverse through s and count char occurrences
        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
            for (int j = 0; j <=i; j++) {
                if (s.charAt(i) == c[j]) {
                    count1++;
                }
                if ((i != s.length() - 1) && (s.charAt(i) == s.charAt(i+1))) {
                    double1++;
                }
            }
        }

        // Traverse through t and count char occurrences
        for (int k = 0; k < t.length(); k++) {
            d[k] = t.charAt(k);
            for (int l = 0; l <= k; l++) {
                if (t.charAt(k) == d[l]) {
                    count2++;
                }
                if ((k != t.length() - 1) && (t.charAt(k) == t.charAt(k+1))) {
                    double2++;
                }
            }
        }
        // If differ occurrances, then false, otherwise true
        if (count1 != count2 || double1 != double2) {
            return false;
        }
        return true;
    }
}
