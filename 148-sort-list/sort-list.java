/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head)
    {
        if(head==null || head.next==null)
        return head;

        ListNode start1=head;
        ListNode start2=divideList(head);
        start1=sortList(start1);
        start2=sortList(start2);
        ListNode startM=merge(start1, start2);
        return startM;
    }
    ListNode divideList(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head.next.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode start2=slow.next;
        slow.next=null;
        return start2;
    }
    ListNode merge(ListNode start1, ListNode start2)
    {
        ListNode startM;
        if(start1.val<=start2.val)
        {
            startM=start1;
            start1=start1.next;
        }
        else
        {
            startM=start2;
            start2=start2.next;
        }
        ListNode trialM=startM;
        while(start1!=null && start2!=null)
        {
            if(start1.val<=start2.val)
            {
                trialM.next=start1;
                start1=start1.next;
                trialM=trialM.next;
            }
            else
            {
                trialM.next=start2;
                start2=start2.next;
                trialM=trialM.next;
            }
        }
        if(start1==null)
        trialM.next=start2;
        else
        trialM.next=start1;

        return startM;
    }
    
}
