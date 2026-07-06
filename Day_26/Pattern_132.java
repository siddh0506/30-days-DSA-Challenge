/*
456. 132 Pattern

Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].

Return true if there is a 132 pattern in nums, otherwise, return false.

 

Example 1:

Input: nums = [1,2,3,4]
Output: false
Explanation: There is no 132 pattern in the sequence.

*/

//Code :

class Solution {
    public boolean find132pattern(int[] nums) {
      Stack<Integer> stack = new Stack<>();
      int third = Integer.MIN_VALUE;
      for(int i = nums.length-1;i>=0;i--){
        if(third>nums[i]){
            return true;
        }
        while(!stack.isEmpty() && nums[i]>stack.peek()){
            third = stack.pop();
        }
        stack.push(nums[i]);
      } 
      return false;
    }
}