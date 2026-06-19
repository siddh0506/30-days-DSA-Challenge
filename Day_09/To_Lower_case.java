709. To Lower Case
Easy
Topics
premium lock icon
Companies
Hint
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

Example 1:

Input: s = "Hello"
Output: "hello"

Code:

class Solution {
    public String toLowerCase(String s) {
return s.toLowerCase();
    }
}


Code: (without toLowerCase()):

class Solution {
    public String toLowerCase(String s) {

        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char)(arr[i] + 32);
            }
        }

        return new String(arr);
    }
}