class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode sprev=null;
        while(fast!=null&&fast.next!=null){
            sprev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        sprev.next=slow.next;
        return head;
    }
}
