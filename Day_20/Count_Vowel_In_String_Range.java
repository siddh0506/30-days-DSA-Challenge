/*

2586. Count the Number of Vowel Strings in Range

Hint
You are given a 0-indexed array of string words and two integers left and right.

A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.

Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].

 

Example 1:

Input: words = ["are","amy","u"], left = 0, right = 2
Output: 2

*/

//Code :

class Solution {
    public int vowelStrings(String[] words, int left, int right) {
       int count = 0;
       for(int i = left; i <=right;i++){
        String word = words[i];
        char  first = word.charAt(0);
        char last = word.charAt(word.length()-1);
        if(isVowel(first) && isVowel(last))
        count++;
       } 
       return count;
    }
    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}