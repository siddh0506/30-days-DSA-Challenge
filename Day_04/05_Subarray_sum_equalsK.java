560. Subarray Sum Equals K

Hint
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2


Code:

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixsum = 0;
        int count =0;
        for(int num : nums){
            prefixsum += num;
            if(map.containsKey(prefixsum - k)){
                count += map.get(prefixsum -k);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);

        }
        return count ;
    }
}