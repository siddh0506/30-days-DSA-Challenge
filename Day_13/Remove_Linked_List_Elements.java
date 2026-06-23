/*

203. Remove Linked List Elements

Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

 

Example 1:


Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
*/

//Code :

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy =new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;

        while(current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return dummy.next;
    }
}