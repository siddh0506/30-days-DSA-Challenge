/*

22. Generate Parentheses

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]

*/

//Code :

class Solution {

    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        backtrack("", 0, 0, n);

        return result;
    }

    private void backtrack(String current,
                           int open,
                           int close,
                           int n){

        if(current.length()==2*n){

            result.add(current);

            return;
        }

        if(open<n){

            backtrack(current+"(",
                      open+1,
                      close,
                      n);
        }

        if(close<open){

            backtrack(current+")",
                      open,
                      close+1,
                      n);
        }
    }
}