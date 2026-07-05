/* 
1248. Count Number of Nice Subarrays

Hint
Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

Return the number of nice sub-arrays.

 

Example 1:

Input: nums = [1,1,2,1,1], k = 3
Output: 2
Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].

*/

//Code :

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    private int atmost(int[] nums,int k){
        int left = 0;
        int odd = 0;
        int count = 0;
        for(int right =0; right<nums.length;right++){
            if(nums[right]%2 == 1)
            odd++;

            while(odd>k){
                if(nums[left]%2 == 1)
                odd--;

                left++;
            }
            count += right-left+1;
        }
        return count;
    }
}