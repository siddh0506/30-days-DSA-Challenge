/*
410. Split Array Largest Sum

Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.

 

Example 1:

Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

*/
//Code :

class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int num : nums){
            low = Math.max(low,num);
            high += num;
        }
        int answer = high;
        while(low <= high){
            int mid = low + (high - low)/2;
            int pieces = 1;
            int currentsum = 0;
            for(int num : nums){
                if(currentsum + num > mid){
                    pieces++;
                    currentsum = 0;
                }
                currentsum += num;
            }
            if(pieces <= k){
                answer = mid;
                high=mid-1;
            }else{
                low = mid+1;
            }
        }
        return answer;
    }
}