/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode sum = answer;
        boolean b = false;
        while(l1 != null || l2 != null){
            int val1, val2, val;
            val1 = (l1 != null) ? l1.val : 0;
            val2 = (l2 != null) ? l2.val : 0;
            if(b){
                val = val1 + val2 + 1;
                b = false;
            } else{
                val = val1 + val2;
            }
            b = (val >= 10);
            sum.next = new ListNode(val % 10);
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            sum = sum.next;
        }
        if(b){
            sum.next = new ListNode(1);
        }
        return answer.next;
    }
}