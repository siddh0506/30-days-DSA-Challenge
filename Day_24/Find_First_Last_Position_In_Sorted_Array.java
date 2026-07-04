/*

34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

*/

//Code :

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums,target);
        int last = findLast(nums,target);
        return new int[]{first,last};
            }
    private int findFirst(int[] nums,int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid]==target){
                ans = mid;
                high = mid -1;
            }
            else if(nums[mid]<target){
                low = mid + 1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
    private int findLast(int nums[],int target){
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low <= high){
            int mid = low  + (high - low )/2;
            if(nums[mid]== target){
                ans = mid;
                low = mid+1;
            }else if(nums[mid]<target){
                low = mid +1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}