383. Ransom Note

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.

 

Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false

Code:
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        for(char  c : magazine.toCharArray()){
            count[c-'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            count[c-'a']--;
            if(count[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}