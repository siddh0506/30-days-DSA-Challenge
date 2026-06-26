/*

844. Backspace String Compare

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

*/

//Code:

class Solution {

    public boolean backspaceCompare(String s, String t) {

        return build(s).equals(build(t));
    }

    private String build(String str) {

        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()) {

            if(ch != '#') {

                stack.push(ch);

            } else if(!stack.isEmpty()) {

                stack.pop();
            }
        }

        StringBuilder result = new StringBuilder();

        for(char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }
}