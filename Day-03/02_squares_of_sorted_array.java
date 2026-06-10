977. Squares of a Sorted Array

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]

Code:
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] result = new int[n];
        int left = 0;
        int right = n-1;
        int pos = n-1;
        while(left<=right){
            int leftsquare = nums[left]*nums[left];
            int rightsquare = nums[right]*nums[right];
            if(leftsquare>=rightsquare){
                result[pos]=leftsquare;
                left++;
            }else{
                result[pos]=rightsquare;
                right--;
            }
            pos--;
        }
        return result;
    }
}