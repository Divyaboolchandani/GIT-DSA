class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode even=head;
        ListNode odd=head.next;
        ListNode oddHead=odd;
        while(odd!=null&&odd.next!=null){
            even.next=odd.next;
            even=even.next;
            odd.next=even.next;
            odd=odd.next;
        }
        even.next=oddHead;
        return head;
    }
}