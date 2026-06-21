/*

2000. Reverse Prefix of Word
Easy
Topics
premium lock icon
Companies
Hint
Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.

 

Example 1:

Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3.

*/

//Code:

class Solution {
    public String reversePrefix(String word, char ch) {
        int ind = word.indexOf(ch);
        if(ind==-1){
            return word;
        }
        String prefix = word.substring(0,ind+1);
        String suffix = word.substring(ind+1);
        String rev = new StringBuilder(prefix).reverse().toString();
        return rev+suffix;
    }
}