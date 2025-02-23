/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *///
import java.util.*;
class Solution {
    public ListNode reverseList(ListNode head) 
    {
        if(head==null || head.next==null)
        return head;
        ListNode newHead=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;

        return newHead;
    }

    void print(ListNode head)
        {
            if(head==null)
            return;
            ListNode current=head;
            while(current!=null)
            {
                System.out.print(current.val+"->");
            }
            System.out.println("null");

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
        head=sol.reverseList(head);
        sol.print(head);


    }
}