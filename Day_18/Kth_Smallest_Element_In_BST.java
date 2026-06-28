/*
230. Kth Smallest Element in a BST

Hint
Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

 

Example 1:


Input: root = [3,1,4,null,2], k = 1
Output: 1
*/

//Code:

class Solution {
    int count = 0;
    int answer = 0;
    public int kthSmallest(TreeNode root, int k) {
       inorder(root,k);
       return answer;
        
    }
    private void inorder (TreeNode root , int k){
        if(root == null)
        return ;
        inorder(root.left,k);
        count ++;
        if(count == k){
            answer = root.val;
            return;
        }
        inorder(root.right,k);
    }
}