/*

567. Permutation in String
Medium
Topics
premium lock icon
Companies
Hint
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

*/

//Code :

class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length())
            return false;

        int[] s1Freq = new int[26];
        int[] window = new int[26];

       
        for (char ch : s1.toCharArray()) {
            s1Freq[ch - 'a']++;
        }

        int k = s1.length();

        for (int right = 0; right < s2.length(); right++) {

          
            window[s2.charAt(right) - 'a']++;

            
            if (right >= k) {
                window[s2.charAt(right - k) - 'a']--;
            }

          
            if (Arrays.equals(s1Freq, window))
                return true;
        }

        return false;
    }
}