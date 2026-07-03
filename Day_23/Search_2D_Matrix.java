/*

74. Search a 2D Matrix

You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true

*/

// Code :

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = rows*cols -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            int row = mid/cols;
            int col = mid % cols;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col] <target) {
                low = mid + 1;
            }
            else{
                high = mid-1;
            }
        }
return false;
    }
}