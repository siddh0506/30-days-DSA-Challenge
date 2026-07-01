/*

424. Longest Repeating Character Replacement

You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.

 

Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

*/

//Code :

class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxfreq = 0;
        int maxlength =0;
        for(int right = 0; right < s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxfreq =Math.max(maxfreq,freq[s.charAt(right)-'A']);
            while((right - left +1)-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left ++;
            }
            maxlength = Math.max(maxlength,right - left + 1);
        }
        return maxlength;
    }
}