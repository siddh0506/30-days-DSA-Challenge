28. Find the Index of the First Occurrence in a String

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.


Code :

class Solution {
    public int strStr(String haystack, String needle) {
        int a = haystack.length();
        int b = needle.length();
        for(int i=0;i<=a-b;i++){
            int j;
            for(j =0;j<b;j++){
            if(haystack.charAt(i+j) != needle.charAt(j)){
                break;
            }
            }
            if(j==b){
                return i;
            }
            
        }
        return -1;
    }
}