/*

101. Symmetric Tree

Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

 

Example 1:


Input: root = [1,2,2,3,4,4,3]
Output: true
*/

// Code :

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left,root.right);
    }
    private boolean isMirror(TreeNode left,TreeNode right){
        if(left == null && right == null)
        return true;
        if(left == null || right == null)
        return false;
        if(left.val != right.val)
        return false;

        return isMirror(left.left,right.right)&&isMirror(left.right,right.left);
    }
}