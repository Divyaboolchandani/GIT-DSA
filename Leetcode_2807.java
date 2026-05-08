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
    public static int gcd(int a,int b){
        while(b!=0){
           int temp=b;
        b=a%b;
        a=temp;  
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode temp=head;
        while(temp!=null&&temp.next!=null){
            int gcd=gcd(temp.val,temp.next.val);
            ListNode newNode=new ListNode(gcd);
            newNode.next=temp.next;
            temp.next=newNode;

            temp=newNode.next;
        }
        return head;
    }
}
