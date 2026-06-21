/*

394. Decode String
Medium
Topics
premium lock icon
Companies
Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.

 

Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"

*/

//Code:

class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringstack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k =0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k*10 + (ch-'0');
            }
            else if (ch=='['){
                countStack.push(k);
                stringstack.push(current);
                k=0;
                current = new StringBuilder();

            }
            else if (ch==']'){
                int repeat =countStack.pop();
                StringBuilder prev = stringstack.pop();
                for(int i =0;i<repeat;i++){
                    prev.append(current);
                }
                current = prev;
            }
            else{
                current.append(ch);
            }
        }
        return current.toString();
    }
}