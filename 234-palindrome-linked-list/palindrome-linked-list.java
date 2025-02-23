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
    boolean isPalindrome(ListNode head) 
    {
        if(head==null || head.next==null)
        return true;

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode middle=slow;
        ListNode newHead=reverse(middle);
        ListNode first=head;
        ListNode second=newHead;
        while(second!=null)
        {
            if(first.val!=second.val)
            return false;
            first=first.next;
            second=second.next;
        }
        return true;

    }
    ListNode reverse(ListNode middle)
    {
        if(middle==null || middle.next==null)
        return middle;
        ListNode newHead=reverse(middle.next);
        ListNode front=middle.next;
        front.next=middle;
        middle.next=null;

        return newHead;
    }
}
// class Main
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner (System.in);
//         Solution sol=new Solution();
//         int n=sc.nextInt();
//         ListNode head=new ListNode(sc.nextInt());
//         ListNode current=head;
//         for(int i=1;i<n;i++)
//         {
//             current.next=new ListNode(sc.nextInt());
//             current=current.next;
//         }
//         sol.isPalindrome(head);
//     }
//}