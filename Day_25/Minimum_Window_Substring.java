/*

76. Minimum Window Substring

Hint
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

 

Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

*/

//Code:

class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
        return "";

        int[] need = new int[128];
        int[] window = new int[128];
        for(char c : t.toCharArray())
        need[c]++;

        int required = 0;
        for(int i = 0; i<128;i++){
            if(need[i]>0)
            required++;
        }
        int formed = 0;
        int left = 0 ;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        for(int right = 0;right<s.length();right++){
            char c = s.charAt(right);
            window[c]++;
            if(need[c]>0 && window[c]== need[c])
            formed++;

            while(formed == required){
                if(right-left+1 < minLen){
                    minLen = right -left +1;
                    start = left ;

                }
                char remove = s.charAt(left);
                window[remove]--;
                if(need[remove]>0 && window[remove]<need[remove]){
                    formed--;

                }
                left++;
            }
        }
            return minLen == Integer.MAX_VALUE ? " " : s.substring(start,start+minLen);
    }
}