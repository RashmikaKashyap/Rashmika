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
class Solution 
{
    public ListNode detectCycle(ListNode head) 
    {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
            slow=head;
            while(slow!=fast)
            {
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
            }
        }
        return null;
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
        ListNode index=sol.detectCycle(head);
        if(index==null)
        System.out.println("no cycle");
        
        else
        System.out.println("tail connects to node index"+index);
    }
}