/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 *///
import java.util.*;
class Solution {
    public boolean hasCycle(ListNode head) 
    {
        ListNode slow=head;
        ListNode fast=head;

        if(slow==null)
        return false;

        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            return true;
        }
        return false;
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution sol=new Solution();
        int n=sc.nextInt();
        ListNode head=new ListNode(sc.nextInt());
        ListNode current=head;
        for(int i=1;i<n;i++)
        {
            current.next=new ListNode(sc.nextInt());
            current=current.next;
        }
        sol.hasCycle(head);

    }
}