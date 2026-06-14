414. Third Maximum Number

Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

 

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.



Code:
class Solution {
    public int thirdMax(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;
        for(int num : nums){
            long n =  num;
            if((first!=null && n==first)||(second!= null && n==second)||(third != null && n==third)){
                continue;
            }
            if(first==null||n>first){
                third = second ;
                second = first;
                first = n;
            }else if (second==null || n>second){
                third = second;
                second = n;
            }
            else if(third == null || n> third ){
                third = n;
            }
        }
        return third == null ? first.intValue() : third.intValue();
    }
}